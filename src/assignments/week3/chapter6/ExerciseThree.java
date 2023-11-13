package assignments.week3.chapter6;

/*
--Exercise 3--

Write a method called negativeSum that accepts a Scanner reading input from a file containing a series of integers,
and print a message to the console indicating whether the sum starting from the first number is ever negative.
You should also return true if a negative sum can be reached and false if not.

For example, suppose the file contains the following text:

38 4 19 -27 -15 -3 4 19 38

Your method would consider the sum of just one number (38), the first two numbers (38 + 4), the first three numbers
(38 + 4 + 19), and so on to the end. None of these sums is negative, so the method would produce the following
output and return false:

no negative sum

If the file instead contains the following numbers:

14 7 -10 9 -18 -10 17 42 98

The method finds that a negative sum of −8 is reached after adding the first six numbers.
It should output the following to the console and return true:

sum of -8 after 6 steps

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseThree {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File(FILE_PREFIX + "negativeSum1.txt"));
        boolean output1 = negativeSum(scanner1);
        System.out.println(output1);

        Scanner scanner2 = new Scanner(new File(FILE_PREFIX + "negativeSum2.txt"));
        boolean output2 = negativeSum(scanner2);
        System.out.println(output2);
    }

    public static boolean negativeSum(Scanner input) {
        int stepCount = 0;
        int sum = 0;

        while(input.hasNextInt()) {
            stepCount++;
            sum += input.nextInt();
            if (sum < 0) {
                System.out.println("sum of " + sum + " after " + stepCount + " steps");
                return true;
            }
        }
        System.out.println("no negative sum");
        return false;
    }
}
