package assignments.week2.chapter4;

/*
--Exercise 9--

Write a method called evenSumMax that accepts a Scanner for the console as a parameter.
The method should prompt the user for a number of integers, then prompt the integer that many times.
Once the user has entered all the integers, the method should print the sum of all the even numbers the user typed,
along with the largest even number typed.
You may assume that the user will type at least one nonnegative even integer.

Here is an example dialogue:

How many integers? 4
Next integer? 2
Next integer? 9
Next integer? 18
Next integer? 4
Even sum = 24, Even max = 18
*/

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        evenSumMax(scanner);
    }

    public static void evenSumMax(Scanner scanner) {
        System.out.print("How many integers? ");
        int numCount = scanner.nextInt();
        int evenSum = 0;
        int evenMax = Integer.MIN_VALUE;

        for (int i = 1; i <= numCount; i++) {
            System.out.print("Next integer? ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                }
            }
        }
        System.out.println("Even sum = " + evenSum + ", Even max = " + evenMax);
    }
}
