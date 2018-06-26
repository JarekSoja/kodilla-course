package kodilla.testing2.crudapp;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://jareksoja.github.io/";
    private WebDriver webDriver;
    private Random generator;

    @Before
    public void initTests() {
        webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
        webDriver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action, \"createTask\")]/fieldset[3]/button";

        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = webDriver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = webDriver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = webDriver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();

        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        webDriver.navigate().refresh();

        while (!webDriver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        webDriver.findElements(By.xpath("//form[@class=\"datatable_row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable_field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[text()=\"Delete\"]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("xxxxxxxxxxx");
        driverTrello.findElement(By.id("password")).sendKeys("xxxxxxxxxxx");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Application\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();

        return result;
    }

    private void removeTestTaskFromCrudApp(String taskName) throws InterruptedException {
        webDriver.navigate().refresh();

        while (!webDriver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        webDriver.findElements(By.xpath("//form[@class=\"datatable_row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable_field-value\"]"))
                                .getText().equals(taskName))
                .forEach(form ->
                        form.findElements(By.xpath(".//button")).stream()
                                .filter(button -> button.getText().equals("Delete"))
                                .forEach(WebElement::click));

        Thread.sleep(2000);
}

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
         sendTestTaskToTrello(taskName);
         Assert.assertTrue(checkTaskExistsInTrello(taskName));
        removeTestTaskFromCrudApp(taskName);
    }

}
