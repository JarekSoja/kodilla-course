package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.Objects;

public class Flight {

    private final String DEPARTURE;
    private String TRANSFER;
    private final String ARRIVAL;


    public Flight(final String DEPARTURE, final String ARRIVAL) {
        this.DEPARTURE = DEPARTURE;
        this.ARRIVAL = ARRIVAL;
    }

    public Flight(String DEPARTURE, String TRANSFER, String ARRIVAL) {
        this.DEPARTURE = DEPARTURE;
        this.TRANSFER = TRANSFER;
        this.ARRIVAL = ARRIVAL;
    }

    public String getDEPARTURE() {
        return DEPARTURE;
    }

    public String getARRIVAL() {
        return ARRIVAL;
    }

    public void setTRANSFER(String TRANSFER) {
        this.TRANSFER = TRANSFER;
    }

    public String getTRANSFER() {
        return TRANSFER;
    }

    @Override
    public String toString() {
        return "Departure: " + DEPARTURE + "\nArrival: " + ARRIVAL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getDEPARTURE(), flight.getDEPARTURE()) &&
                Objects.equals(getARRIVAL(), flight.getARRIVAL());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDEPARTURE(), getARRIVAL());
    }
}
