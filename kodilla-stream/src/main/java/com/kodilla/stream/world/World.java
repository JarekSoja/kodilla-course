package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;

public class World {

    private Set<Continent> world;

    public World(Set<Continent> world) {
        this.world = world;
    }

    public Set<Continent> getContinents(){
        return world;
    }

    public void addContinent(Continent continent){
        this.world.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal result = this.getContinents().stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return result;

    }
}
