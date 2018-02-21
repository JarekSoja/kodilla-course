package com.kodilla.stream.world;

import java.util.Set;

public class Continent {

    private Set<Country> countries;

    public Continent(Set<Country> countries) {
        this.countries = countries;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country){
        countries.add(country);
    }

}
