package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Stream {
    public static void main(String[]args) {
        String movies = MovieStore.getMovies().entrySet().stream()
                .map(g -> g.getValue())
                .flatMap(h -> h.stream())
                .collect(Collectors.joining("!"));
        System.out.println(movies);
    }
}