package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser testTest = new ForumUser("Test Test");
        ForumUser testTest2 = new ForumUser("Test2 Test2");
        ForumUser testTest3 = new ForumUser("Test3 Test3");
        javaHelpForum.registerObserver(testTest);
        javaToolsForum.registerObserver(testTest2);
        javaHelpForum.registerObserver(testTest3);
        javaToolsForum.registerObserver(testTest3);
        //When
        javaHelpForum.addPost("ddddddddddd");
        javaHelpForum.addPost("dddddddddddddddddd");
        javaHelpForum.addPost("vvvvvvvvvvv");
        javaToolsForum.addPost("vvvvvvvvvvvvvv");
        javaToolsForum.addPost("rrrrrrrrrrrrr");
        //Then
        Assert.assertEquals(3, testTest.getUpdateCount());
        Assert.assertEquals(2, testTest2.getUpdateCount());
        Assert.assertEquals(5, testTest3.getUpdateCount());
    }
}
