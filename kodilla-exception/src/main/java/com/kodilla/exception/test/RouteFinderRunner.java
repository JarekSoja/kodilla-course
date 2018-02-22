package com.kodilla.exception.test;

public class RouteFinderRunner {

    public static void main (String[] args) {

        RouteFinder routeFinder = new RouteFinder();
        try {
            boolean flight = routeFinder.findFlight(new Flight("Warsaw", "Los Angeles"));
            System.out.println(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("No flights to this destination");
        } finally {
            System.out.println("Have a very nice day.");
        }
    }
}
