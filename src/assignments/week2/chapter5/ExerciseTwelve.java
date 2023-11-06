package assignments.week2.chapter5;

/*
--Exercise 12--
Write a method called printAverage that uses a sentinel loop to repeatedly prompt the user for numbers.
Once the user types any number less than zero, the method should display the average of all nonnegative numbers typed.
Display the average as a double.

Here is a sample dialogue with the user:

Type a number: 7
Type a number: 4
Type a number: 16
Type a number: –4
Average was 9.0

If the first number that the user types is negative, do not print an average.

*/

import java.util.Scanner;

public class ExerciseTwelve {
    public static void main(String[] args) {
        printAverage();
    }

    public static void printAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number = getNumber(scanner);
        if (number < 0) {
            return;
        }

        while (number > 0) {
            sum += number;
            count++;
            number = getNumber(scanner);
        }

        System.out.println("Average was " + (double) sum / count);
    }

    public static int getNumber(Scanner scanner) {
        System.out.print("Type a number: ");
        return scanner.nextInt();
    }
}
