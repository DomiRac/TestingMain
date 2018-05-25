package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightCrawler {
    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw Chopin Airport", true);
        flights.put("Doha Aiport", true);
        return flights;
    }
}
