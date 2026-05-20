package org.example;

public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double restar(){
        return num1 - num2;
    }
}

