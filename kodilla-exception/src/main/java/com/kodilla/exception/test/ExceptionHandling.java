package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[]args) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            challenge.probablyIWillThrowException(4.8, 6.6);
        } catch (Exception e) {
            System.out.println("Uuuuups.");
        } finally {
            System.out.println("Always here...");
        }
    }
}
