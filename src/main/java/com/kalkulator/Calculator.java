package com.kalkulator;

public class Calculator {
    public void addAtoB(int valueA, int valueB) {
        System.out.println("A + b = " + (valueA + valueB));
    }
    public void substractAfromB(int valueA, int valueB) {
        System.out.println("A - b = " + (valueA - valueB));
    }
    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        calculator.addAtoB(2,7);
        calculator.substractAfromB(8, 2);
    }
}

