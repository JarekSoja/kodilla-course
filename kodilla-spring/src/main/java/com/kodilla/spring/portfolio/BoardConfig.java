package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    Board getBoard(){
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean
    public TaskList taskList(){
        return new TaskList();

    }
}
