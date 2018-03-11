package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

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
        board.getNewestTasks();
        //Then
        //Do nothing

    }
}
