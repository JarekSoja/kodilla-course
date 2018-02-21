package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //Given
        ArrayList<Integer> input = new ArrayList<>();
        //When
        ArrayList<Integer> test = OddNumbersExterminator.exterminator(input);
        System.out.println("Testing empty input");
        //Then
        Assert.assertEquals(test, input);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> properTestResult = new ArrayList<>();
        for (int i = 0; i < 500; i++){
            input.add(i);
            if (i%2==0){
                properTestResult.add(i);
            }
        }
        //When
        ArrayList<Integer> test = OddNumbersExterminator.exterminator(input);
        System.out.println("Testing input of first 500 natural numbers");
        //Then
        Assert.assertEquals(test, properTestResult);
    }
}


