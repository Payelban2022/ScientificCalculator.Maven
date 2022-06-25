package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        x = 0;
        System.out.println(0);
        System.out.print("Enter the number");
        x=input.nextDouble();
        System.out.println(x);
        double y;
        y = input.nextDouble();
        System.out.println(y);
        System.out.println("Enter operator: Addition, Subtraction, Multiplication and Division");
        String Op = input.next();
        System.out.println(Op);
        if ( Op.equals("Addition")) {
            double n;
            n = x + y;
            System.out.println(n);
        } else if (Op.equals("Subtraction")) {
            double n;
            n = x - y;
            System.out.println(n);
        } else if (Op.equals("Multiplication")) {
            double n;
            n = x * y;
            System.out.println(n);
        } else if
        (Op.equals("Division")) {
            if (y != 0) {
                double n;
                n = x / y;
                System.out.println(n);
            } else {
                System.out.println("Error");
            }

        }
            else {System.out.println("This is not a required function.");

            }




        }


    }








