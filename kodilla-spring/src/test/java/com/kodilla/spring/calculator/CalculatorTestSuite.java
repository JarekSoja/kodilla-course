package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(2,3);
        double resultSub = calculator.sub(4,2);
        double resultMul = calculator.mul(2,2);
        double resultDiv = calculator.div(6,3);
        //Then
        Assert.assertEquals(resultAdd,5,0);
        Assert.assertEquals(resultSub, 2,0);
        Assert.assertEquals(resultMul, 4, 0);
        Assert.assertEquals(resultDiv, 2,0);
    }

}
