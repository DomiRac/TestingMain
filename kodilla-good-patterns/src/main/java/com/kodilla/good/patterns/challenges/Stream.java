package com.kodilla.good.patterns.challenges;

public class Stream {
    public static void main(String[]args) {
        MovieStore.getMovies().stream()
                .map(s -> s.replaceAll(" ", "!"))
                .forEach(System.out::println);
    }
}
