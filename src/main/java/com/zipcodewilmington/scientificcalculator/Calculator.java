package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        x = 0;
        System.out.println(0);
        System.out.print("Enter the number");
        x=input.nextInt();
        System.out.println(x);
        int y;
        y = input.nextInt();
        System.out.println(y);
        System.out.println("Enter operator: Addition, Substraction, Multiplication and Division");
        String Op = input.next();
        System.out.println(Op);
        if ( Op.equals("Addition")) {
            int n;
            n = x + y;
            System.out.println(n);
        }

    }


}


