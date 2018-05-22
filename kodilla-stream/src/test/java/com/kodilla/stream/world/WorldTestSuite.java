package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.*;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {


        Set<Country> countriesOfAzeroth = new HashSet<>();
        countriesOfAzeroth.add(new Country("Kalimdor", new BigDecimal("2222")));
        countriesOfAzeroth.add(new Country("Easter Kingdoms", new BigDecimal("222")));
        countriesOfAzeroth.add(new Country("Pandaria", new BigDecimal("333")));
        countriesOfAzeroth.add(new Country("Northrend", new BigDecimal("444")));

        Set<Country> countriesOfDraenor = new HashSet<>();
        countriesOfDraenor.add(new Country("Gorgrond", new BigDecimal("555")));
        countriesOfDraenor.add(new Country("Nagrand", new BigDecimal("666")));

        Continent azeroth = new Continent("Azeroth", countriesOfAzeroth);
        Continent draenor = new Continent("Draenor", countriesOfDraenor);


        World wowWorld = new World();
        wowWorld.addContinent(azeroth);
        wowWorld.addContinent(draenor);


        BigDecimal totalPopulation = BigDecimal.ZERO;
        totalPopulation = totalPopulation.add(wowWorld.getPeopleQuantity());

        BigDecimal expectedPopulation = new BigDecimal("4442");
        Assert.assertEquals(expectedPopulation, totalPopulation);
    }
}
