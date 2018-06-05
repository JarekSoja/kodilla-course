package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable {

    private List<String> tasks;
    private Observer mentor;
    private String studentName;


    public Homework(String studentName) {
        this.studentName = studentName;
        this.tasks = new ArrayList<>();
    }

    public void addHomework(String name) {
        tasks.add(name);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        mentor = observer;
    }

    @Override
    public void notifyObserver() {
        this.mentor.update(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        mentor = null;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }
}
