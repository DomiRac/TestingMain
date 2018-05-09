package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Kittieeeees", (a -> a.toUpperCase()));
        poemBeautifier.beautify("Kittieeeees", (a -> a + "are so sweeeet"));
        poemBeautifier.beautify("Kittieeeees!", ( a -> "WHAAAAT? " + a));
        poemBeautifier.beautify("Kittieeeees", (a -> String.valueOf(a.length())));
        poemBeautifier.beautify("Kittieeeees", ( a -> a + a + a + a));
        poemBeautifier.beautify("Kittieeeees", (a -> a.replace('i', '!')));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}

