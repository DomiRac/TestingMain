package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightCrawler {
    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        if (flights.containsKey(flight.getArrivalAirport())) {
            System.out.println("You can fly from: " + flight.getArrivalAirport() + "to: " + flight.getDepartureAirport());
        } else {
            throw new RouteNotFoundException("Sorry, there is no flight");
        }
        return flights;
    }
}
