package com.kodilla.good.patterns.challenges;

public class Stream {
    public static void main(String[]args) {
        MovieStore.getMovies().entrySet().stream()
                .map(g -> g.getValue())
                .map(d -> d.toString().replaceAll(", ", "!"))
                .forEach(System.out::print);
    }
}