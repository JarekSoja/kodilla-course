package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminator (ArrayList<Integer> numbers){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : numbers){
            if (i%2==0){
                result.add(i);
            }
        }
        return result;
    }
}
