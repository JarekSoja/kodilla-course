package com.kodilla.spring.portfolio;

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

    public void getNewestTasks(){
        System.out.println(this.toDoList.getTask(0));
        System.out.println(this.inProgressList.getTask(0));
        System.out.println(this.doneList.getTask(0));
    }
}
