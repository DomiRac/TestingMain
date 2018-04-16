package com.kodilla.testing;

import com.kodilla.testing.Calculator.Calculator;
import com.kodilla.testing.User.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("System OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test- pierwszy test jednostkowy");
        Calculator calculator = new Calculator();

        int result1 = calculator.add(4, 9);
        System.out.println(result1);
        int result2 = calculator.substract(6, 4);
        System.out.println(result2);
    }
}
