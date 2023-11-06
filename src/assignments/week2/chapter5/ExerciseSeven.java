package assignments.week2.chapter5;

/*
--Exercise 7--

Write a method called diceSum that accepts a Scanner for the console as a parameter and prompts for a desired sum,
then repeatedly simulates the rolling of 2 six-sided dice until their sum is the desired sum.

Here is a sample dialogue with the user:

Desired dice sum: 9
4 and 3 = 7
3 and 5 = 8
5 and 6 = 11
5 and 6 = 11
1 and 5 = 6
6 and 3 = 9
*/

import java.util.Random;
import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        diceSum(scanner);
    }

    public static void diceSum(Scanner scanner) {
        Random random = new Random();
        System.out.print("Desired dice sum: ");
        int desiredSum = scanner.nextInt();
        if (desiredSum < 2 || desiredSum > 12) {
            throw new IllegalArgumentException("Desired sum must be between 2 and 12 inclusive");
        }
        int dice1;
        int dice2;
        int sum = 0;
        while (sum != desiredSum) {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            sum = dice1 + dice2;
            System.out.println(dice1 + " and " + dice2 + " = " + sum);
        }
    }
}
