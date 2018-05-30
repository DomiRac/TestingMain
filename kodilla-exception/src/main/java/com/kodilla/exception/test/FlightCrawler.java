package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightCrawler {
    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw Airport", true);
        flights.put("Doha Airport", true);
        flights.put("Bahama Airport", false);
        flights.put("London Airport", false);
        if (flights.containsKey(flight.getArrivalAirport()) && flights.containsKey(flight.getDepartureAirport()))  {
            System.out.println("Connection from: " + flight.getArrivalAirport() + " to: " + flight.getDepartureAirport() + " is available");
        } else {
            throw new RouteNotFoundException("Sorry, there is no flight");
        }
        return flights;
    }
}
