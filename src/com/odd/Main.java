// Java program to demonstrate continue in an if statement and print odd numbers

package com.odd;

// Main class
public class Main {

    //Method main to run java program
    public static void main(String[] args) {

        // Creating loop for ten iterations
        for (int number = 0; number < 10; number++){

            // If number is even
            if (number % 2 == 0)
                continue;

            // If number is odd
            System.out.println(number);
        }
    }
}