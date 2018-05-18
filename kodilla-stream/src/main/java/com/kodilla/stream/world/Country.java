package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;


public class Country {
    private final String nameOfTheCountry;
    private final BigDecimal populationOfTheCountry;

    public Country(String nameOfTheCountry, BigDecimal populationOfTheCountry) {
        this.nameOfTheCountry = nameOfTheCountry;
        this.populationOfTheCountry = populationOfTheCountry;
    }

    public String getNameOfTheCountry() {
        return nameOfTheCountry;
    }


    public BigDecimal getPopulation() {
        return populationOfTheCountry;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(getNameOfTheCountry(), country.getNameOfTheCountry());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNameOfTheCountry());
    }
}
