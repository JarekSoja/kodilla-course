package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        //Given
        Logger.getInstance().log("User logged 12:22:31");
        //When
        String testedLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("User logged 12:22:31", testedLog);
    }

}
