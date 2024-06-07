package com.adhyan;

/**
 * @author Adhyan
 * date 02/12/2024
 * FizzBuzz game implementation in Java.
 */
import java.util.Scanner;

public class FizzBuzz {
    /**
     * Main method
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the last number of the range
        System.out.println("Enter your last number : ");
        int lowernumber = input.nextInt();

        // Call the fizzBuzz method to play the game
        fizzBuzz(1, lowernumber);
    }

    /**
     * FizzBuzz game implementation.
     * @param number The starting number of the range.
     * @param lowernumber The ending number of the range.
     */
    public static void fizzBuzz(int number, int lowernumber) {
        // Loop through the range of numbers
        for (int i = number; i <= lowernumber; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // If none of the above conditions are met, print the number itself
            else {
                System.out.println(i);
            }
        }
    }
}
