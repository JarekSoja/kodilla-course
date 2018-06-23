package com.kodilla.testing2.facebook;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_FIRSTNAME = "u_0_q";
    public static final String XPATH_LASTNAME = "u_0_s";
    public static final String XPATH_DUMMY_MAIL = "u_0_v";
    public static final String XPATH_DUMMY_PASSWORD = "u_0_12";
    public static final String XPATH_BIRTH_DAY = "day";
    public static final String XPATH_BIRTH_MONTH = "month";
    public static final String XPATH_BIRTH_YEAR = "year";


    public static void main(String[] args) {

        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        Actions actions = new Actions(webDriver);


        webDriver.get("https://facebook.com");

        WebElement firstnameField = webDriver.findElement(By.id(XPATH_FIRSTNAME));
        firstnameField.sendKeys("DUMMY NAME");

        WebElement lastnameField = webDriver.findElement(By.id(XPATH_LASTNAME));
        lastnameField.sendKeys("DUMMY SURNAME");

        WebElement mailField = webDriver.findElement(By.id(XPATH_DUMMY_MAIL));
        mailField.sendKeys("DUMMY@DUMMY.COM");


        WebElement passwordField = webDriver.findElement(By.id(XPATH_DUMMY_PASSWORD));
        actions.moveToElement(passwordField);
        actions.click();
        actions.sendKeys("YEP, DUMMY PASSWORD");
        actions.build().perform();

        WebElement selectDay = webDriver.findElement(By.id(XPATH_BIRTH_DAY));
        Select dayOfBirth = new Select(selectDay);
        dayOfBirth.selectByIndex(13);

        WebElement selectMonth = webDriver.findElement(By.id(XPATH_BIRTH_MONTH));
        Select monthOfBirth = new Select(selectMonth);
        monthOfBirth.selectByIndex(4);

        WebElement selectYear = webDriver.findElement(By.id(XPATH_BIRTH_YEAR));
        Select yearOfBirth = new Select(selectYear);
        yearOfBirth.selectByValue("1973");

    }
}
