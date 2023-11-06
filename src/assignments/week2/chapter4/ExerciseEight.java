package assignments.week2.chapter4;

/*
--Exercise 8--

Write a method called smallestLargest that accepts a Scanner for the console as a parameter and asks the user to
enter numbers, then prints the smallest and largest of all the numbers supplied by the user.
You may assume that the user enters a valid number greater than 0 for the number of numbers to read.

Here is a sample execution:

How many numbers do you want to enter? 4
Number 1: 5
Number 2: 11
Number 3: -2
Number 4: 3
Smallest = -2
Largest = 11

*/

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        smallestLargest(scanner);
    }

    public static void smallestLargest(Scanner scanner) {
        System.out.print("How many numbers do you want to enter? ");
        int numCount = scanner.nextInt();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 1; i <= numCount; i++) {
            System.out.print("Number " + i + ": ");
            int num = scanner.nextInt();
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }
}
