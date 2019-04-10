package com.LambdaCalculator;

import java.util.Scanner;

public class CalculatorFunctionality {

    Scanner scanInput = new Scanner(System.in);
    int a, b, res;

    //add function
    public void add() {
        System.out.println("Enter two numbers");
        int a = scanInput.nextInt();
        int b = scanInput.nextInt();
        res = a + b;
        System.out.println("addition is " + res);
    }

    //subtract function
    public void sub() {
        System.out.println("Enter two numbers");
        int a = scanInput.nextInt();
        int b = scanInput.nextInt();
        res = a - b;
        System.out.println("subtraction is " + res);

    }
    //multiply function
    public void multiply() {
        System.out.println("Enter two numbers");
        int a = scanInput.nextInt();
        int b = scanInput.nextInt();
        res = a * b;
        System.out.println("multiplication is " + res);
    }
    //divide function
    public void divide() {
        System.out.println("Enter two numbers");
        int a = scanInput.nextInt();
        int b = scanInput.nextInt();
        res = a / b;
        System.out.println("division is " + res);
    }


}
