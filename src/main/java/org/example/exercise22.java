/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = nums.nextInt();

        System.out.print("Enter the second number: ");
        int number2= nums.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = nums.nextInt();

        if (number1 == number2)
        {
           System.exit(0);
        }
        if (number1 == number3)
        {
            System.exit(0);
        }
        if (number2 == number3)
        {
            System.exit(0);
        }

        if (number1 > number2)
        {
            if (number1 > number3)
                System.out.printf("The largest number is %d.\n", number1 );
        }
        if (number2 > number1)
        {
            if (number2 > number3)
                System.out.printf("The largest number is %d.\n", number2 );
        }
        if (number3 > number1)
        {
            if (number3 > number2)
                System.out.printf("The largest number is %d.\n", number3 );
        }

    }
}
