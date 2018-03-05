package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.Objects;

public class Flight {

    private final String departure;
    private String transfer;
    private final String arrival;


    Flight(final String departure, final String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

   Flight(String departure, String transfer, String arrival) {
        this.departure = departure;
        this.transfer = transfer;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getTransfer() {
        return transfer;
    }

    @Override
    public String toString() {
        return "Departure: " + departure + "\nArrival: " + arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getDeparture(), flight.getDeparture()) &&
                Objects.equals(getArrival(), flight.getArrival());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDeparture(), getArrival());
    }
}
