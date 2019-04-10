package com.LambdaCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) throws IOException {

        //Lambda function implementation
        Calculator calculator = () -> {
            char userChoice;

            System.out.println("-----Calculator Application----\n\n");

            //menu driven calculator application
            do {
                CalculatorFunctionality functionality = new CalculatorFunctionality();
                Scanner scanChoice = new Scanner(System.in);
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("1:add\n2:subtract\n3:multiply\n4:divide\n5:Exit");
                int choice = scanChoice.nextInt();

                switch (choice) {
                    case 1:
                        functionality.add();
                        break;
                    case 2:
                        functionality.sub();
                        break;
                    case 3:
                        functionality.multiply();
                        break;
                    case 4:
                        functionality.divide();
                        break;
                    case 5:
                        System.out.println("---------Exit Application-------");
                        System.exit(0);
                        break;
                }
                Scanner scanUserChoice = new Scanner(System.in);
                System.out.println("Do you wish to continue?? (y-yes||n-no)");
                userChoice = (char) br.read();


            } while (userChoice == 'y');


        };

        calculator.calculate();

    }
}
