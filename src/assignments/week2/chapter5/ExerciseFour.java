package assignments.week2.chapter5;

/*
--Exercise 4--
Write a method called randomX that prints a lines that contain a random number of “x” characters
(between 5 and 20 inclusive) until it prints a line that contains 16 or more characters.

For example, the output might look like the following:

xxxxxxx
xxxxxxxxxxxxxxx
xxxxxxxxxxxx
xxxxxxxxxxxxxx
xxxxxx
xxxxxxxxxxx
xxxxxxxxxxxxxxxxx
*/

import java.util.Random;

public class ExerciseFour {
    public static void main(String[] args) {
        randomX();
    }

    public static void randomX() {
        Random random = new Random();
        int x = generateRandomNumber(random);
        while (x < 16) {
            printX(x);
            System.out.println();
            x = generateRandomNumber(random);
        }
        printX(x);
    }

    public static int generateRandomNumber(Random random) {
        return random.nextInt(15) + 5;
    }

    public static void printX(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("x");
        }
    }
}
