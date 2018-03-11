package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskList {

    private List<String> tasks;

    @Autowired
    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public String getTask(int taskPosition) {
        return this.tasks.get(taskPosition);
    }
}
