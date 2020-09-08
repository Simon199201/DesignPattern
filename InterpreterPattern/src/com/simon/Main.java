package com.simon;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator("5 + 4");
        int calculator1 = calculator.calculator();
        System.out.println("5 + 4 = " +calculator1);
    }
}
