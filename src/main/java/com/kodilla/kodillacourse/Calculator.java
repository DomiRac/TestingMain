package com.kodilla.kodilla;

public class Calculator {
    public int addAtoB (int a, int b) {
        return a + b;
    }
}

class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.addAtoB(7, 8);
        System.out.println(result);
    }
}
