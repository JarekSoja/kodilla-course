package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.Scanner;

public class Commander{

    private static Scanner reader = new Scanner(System.in);

    public static int welcomeMenu(){
        System.out.println("Hello! Please choose one option:\n1. Searching for flights departing from particular city.");
        System.out.println("2. Searching for flights arriving to particular city.\n3. Searching for a connection with transfer in particular city.");
        boolean correctValue = false;
        int value = 0;
        do {
            String input = reader.next();
            try {
                value = Integer.parseInt(input);
                if (value < 1 || value > 3) {
                    correctValue = false;
                    System.out.println("Incorrect value.");
                } else {
                    correctValue = true;
                }
            } catch (Exception e) {
                System.out.println("Incorrect value.");
            }
        } while (!correctValue);
        return value;
    }

    public static String singleCitySearch(){
        System.out.println("Please enter the city: ");
        return reader.next();
    }

    public static Flight transferFlightSearch(){
        System.out.println("Please enter the city of departure: ");
        String departure = reader.next();
        System.out.println("Please enter the city of arrival: ");
        String arrival = reader.next();
        System.out.println("Please enter the city of desired transfer: ");
        String transfer = reader.next();
        Flight flight = new Flight(departure, arrival, transfer);
        return flight;

    }


}
