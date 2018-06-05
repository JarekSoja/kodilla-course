package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Homework studentAHomework = new StudentAHomework("Student A");
        Homework studentBHomework = new StudentAHomework("Student B");
        Homework studentCHomework = new StudentAHomework("Student C");
        Mentor mentor1 = new Mentor("Abc Def");
        Mentor mentor2 = new Mentor("Xyz Ghi");
        studentAHomework.registerObserver(mentor1);
        studentBHomework.registerObserver(mentor1);
        studentCHomework.registerObserver(mentor2);
        //When
        studentAHomework.addHomework("Iteration");
        studentBHomework.addHomework("For loop");
        studentBHomework.addHomework("Spring Boot");
        studentCHomework.addHomework("Hibernate");
        studentCHomework.addHomework("UML");
        //Then
        Assert.assertEquals(3, mentor1.getUpdateCount());
        Assert.assertEquals(2, mentor2.getUpdateCount());
    }

}