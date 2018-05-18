package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.*;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {


        List<Country> countriesOfAzeroth = new LinkedList<>();
        countriesOfAzeroth.add(new Country("Kalimdor", new BigDecimal("2222")));
        countriesOfAzeroth.add(new Country("Easter Kingdoms", new BigDecimal("222")));
        countriesOfAzeroth.add(new Country("Pandaria", new BigDecimal("333")));
        countriesOfAzeroth.add(new Country("Northrend", new BigDecimal("444")));

        List<Country> countriesOfDraenor = new LinkedList<>();
        countriesOfDraenor.add(new Country("Gorgrond", new BigDecimal("555")));
        countriesOfDraenor.add(new Country("Nagrand", new BigDecimal("666")));

       Continent azeroth = new Continent("Azeroth", countriesOfAzeroth);
       Continent draenor = new Continent("Draenor", countriesOfDraenor);


        List<Continent> wowWorld = new LinkedList<>();
        wowWorld.add(azeroth);
        wowWorld.add(draenor);



        BigDecimal totalPopulation = wowWorld.stream()
                .map(World::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));


            BigDecimal expectedPopulation = new BigDecimal("2331");
            Assert.assertEquals(expectedPopulation, totalPopulation);
        }
    }
}
