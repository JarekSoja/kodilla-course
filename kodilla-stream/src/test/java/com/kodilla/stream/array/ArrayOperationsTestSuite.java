package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {2,4,7,8,12,34,55,87,122,125,168,222,346,543,567,876,899,985,989,1010};


        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then

        Assert.assertEquals(353.05, result, 0);
    }
}
