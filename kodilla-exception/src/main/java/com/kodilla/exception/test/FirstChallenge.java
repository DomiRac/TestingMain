package com.kodilla.exception.test;

public class FirstChallenge {

    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        try {

            divide(3, 0);

        } catch (ArithmeticException e) {

            System.out.println("Deviding by zero is WRONG!");

        } finally {

            System.out.println("Is your divided was correct?");

        }
    }
}