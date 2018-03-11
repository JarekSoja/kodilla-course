package com.kodilla.spring.calculator;

import org.springframework.stereotype.Controller;

@Controller
public final class Display {

    void displayValue(double val){
        System.out.println(val);
    }
}
