package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Continent {
    private final String nameOfContinent;
    private final List<Country> countries;

    public Continent(String nameOfContinent, List<Country> continent) {
        this.nameOfContinent = nameOfContinent;
        this.countries = continent;
    }


    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getCountries() {
        return countries;
    }
    public void addCountry(Country country) {
        countries.add(country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return Objects.equals(getNameOfContinent(), continent.getNameOfContinent());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNameOfContinent());
    }
}

