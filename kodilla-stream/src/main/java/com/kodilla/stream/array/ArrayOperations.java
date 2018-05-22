package com.kodilla.stream.array;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        return IntStream.rangeClosed(0, numbers.length -1)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
    }
}
