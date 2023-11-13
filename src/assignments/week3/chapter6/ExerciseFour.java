package assignments.week3.chapter6;

/*
--Exercise 4--

Write a method called countCoins that accepts a Scanner representing an input file whose data is a series of pairs of
tokens, where each pair begins with an integer and is followed by the type of coin, which will be “pennies”
(1 cent each), “nickels” (5 cents each), “dimes” (10 cents each), or “quarters” (25 cents each), case-insensitively.
Add up the cash values of all the coins and print the total money.

For example, if the input file contains the following text:

3 pennies 2 quarters 1 Pennies 23 NiCkeLs 4 DIMES

For the input above, your method should produce the following output:

Total money: $2.09
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseFour {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_PREFIX + "countCoins.txt"));
        countCoins(scanner);
    }

    public static void countCoins(Scanner input) {
        int sum = 0;
        while (input.hasNext()) {
            int val = input.nextInt();
            String coinType = input.next();
            coinType = coinType.toLowerCase();
            switch (coinType) {
                case "pennies":
                    sum += val;
                    break;
                case "nickels":
                    sum += val * 5;
                    break;
                case "dimes":
                    sum += val * 10;
                    break;
                case "quarters":
                    sum += val * 25;
                    break;
            }
        }
        System.out.println("Total money: $" + sum / 100.0);
    }
}
