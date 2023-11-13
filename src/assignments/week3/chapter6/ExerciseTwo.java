package assignments.week3.chapter6;


/*
--Exercise 2--

Write a method called evenNumbers that accepts a Scanner reading input from a file with a series of integers,
and report various statistics about the integers to the console. Report the total number of numbers,
the sum of the numbers, the count of even numbers and the percent of even numbers.

For example, if the input file contains the following text:

5 7 2 8 9 10 12 98 7 14 20 22

Then the method should produce the following console output:

12 numbers, sum = 214
8 evens (66.67%)

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseTwo {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_PREFIX + "evenNumbers.txt"));
        evenNumbers(scanner);
    }

    public static void evenNumbers(Scanner input) {
        int itemCount = 0;
        int sum = 0;
        int evenCount = 0;

        while (input.hasNext()) {
            int item = input.nextInt();
            itemCount++;
            sum += item;
            if (item % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println(itemCount + " numbers, sum = " + sum);
        System.out.printf("%d evens (%.2f%%)%n", evenCount, 100.0 * evenCount / itemCount);
    }
}
