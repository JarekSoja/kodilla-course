package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        board.newTaskToDoList("New task to add");
        board.newTaskInProgressList("New task in progress");
        board.newTaskDoneList("New task done");
        //When
        List<String> tasks =  board.getNewestTasks();
        //Then
        Assert.assertEquals("New task to add", tasks.get(0));
        Assert.assertEquals("New task in progress", tasks.get(1));
        Assert.assertEquals("New task done", tasks.get(2));
    }
}
