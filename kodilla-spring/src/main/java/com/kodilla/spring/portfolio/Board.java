package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void newTaskToDoList(String task) {
        this.toDoList.addTask(task);
    }

    public void newTaskInProgressList(String task) {
        this.inProgressList.addTask(task);
    }

    public void newTaskDoneList(String task) {
        this.doneList.addTask(task);
    }

    public List<String> getNewestTasks(){
        List<String> result = new ArrayList<>();
        result.add(this.toDoList.getTask(0));
        result.add(this.inProgressList.getTask(0));
        result.add(this.doneList.getTask(0));
        return result;
    }
}
