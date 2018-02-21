package com.kodilla.stream.sand;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Set<Country> europeanCountries = new HashSet<>();
        europeanCountries.add(new Country("Poland", new BigDecimal("38000000")));
        europeanCountries.add(new Country("France", new BigDecimal("55000000")));
        europeanCountries.add(new Country("Spain", new BigDecimal("46000000")));
        europeanCountries.add(new Country("Slovakia", new BigDecimal("9000000")));
        Continent europe = new Continent(europeanCountries);
        Set<Country> africanCountries = new HashSet<>();
        africanCountries.add(new Country("Ghana", new BigDecimal("27000000")));
        africanCountries.add(new Country("Nigeria", new BigDecimal("185000000")));
        africanCountries.add(new Country("Chad", new BigDecimal("13000000")));
        africanCountries.add(new Country("Sudan", new BigDecimal("38000000")));
        Continent africa = new Continent(africanCountries);
        Set<Country> asianCountries = new HashSet<>();
        asianCountries.add(new Country("China", new BigDecimal("1500000000")));
        asianCountries.add(new Country("India", new BigDecimal("1000000000")));
        asianCountries.add(new Country("Japan", new BigDecimal("125000000")));
        asianCountries.add(new Country("Mongolia", new BigDecimal("3000000")));
        Continent asia = new Continent(asianCountries);
        Set<Continent> world = new HashSet<>();
        world.add(africa);
        world.add(asia);
        world.add(europe);
        World globe = new World(world);

        //When
        BigDecimal result = globe.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("3039000000"), result);
    }
}



