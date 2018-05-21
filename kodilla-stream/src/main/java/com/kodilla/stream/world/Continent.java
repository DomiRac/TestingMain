package com.kodilla.stream.world;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Continent {
    private final String nameOfContinent;
    private final Set<Country> countries;

    public Continent(String nameOfContinent, Set<Country> countries) {
        this.nameOfContinent = nameOfContinent;
        this.countries = countries;
    }


    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public Set<Country> getCountries() {
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

