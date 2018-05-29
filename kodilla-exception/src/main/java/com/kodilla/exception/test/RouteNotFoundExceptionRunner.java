//package com.kodilla.exception.test;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class RouteNotFoundExceptionRunner {
//    public static void main(String[] args) {
//        FlightCrawler crawler = new FlightCrawler();
//        Flight flight1 = new Flight("Warsaw Airport", "Doha Airport");
//        Flight flight2 = new Flight("Oslo Airport", "New York Airport");
//         Map<String, Boolean> flights = crawler.findFlight();
//
//        try {
//            crawler.findFlight(flight1);
//        } catch (RouteNotFoundException e) {
//            System.out.println("Sorry there is no flight you're searching :(");
//        }
//    }
//}
