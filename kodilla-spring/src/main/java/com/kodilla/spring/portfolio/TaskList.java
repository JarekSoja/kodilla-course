package com.kodilla.spring.portfolio;


import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

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
