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

        double result = 0, a = 0, b = 0;

        try {

            a = 3;
            b = 0;
            result = divide(a, b);
            System.out.println(result);


        } catch (ArithmeticException e) {

            System.out.println("Deviding by zero is WRONG!");

        } finally {

            System.out.println("Was your divided correct?");

        }
    }
}