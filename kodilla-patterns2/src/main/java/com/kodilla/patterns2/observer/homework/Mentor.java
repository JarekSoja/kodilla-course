package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private int updateCount;
    private final String username;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Homework homework) {
        System.out.println("New task from " + homework.getStudentName() + ". Total tasks sent by this student: " + homework.getTasks().size());
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public String getUsername() {
        return username;
    }
}
