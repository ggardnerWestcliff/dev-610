package assignments.week3.chapter6;

/*
--Exercise 15--

Write a method called coinFlip that accepts a Scanner representing an input file of coin flips that are heads (H) or
tails (T). Consider each line to be a separate set of coin flips and output the number and percentage of heads
in that line. If it is more than 50%, print “You win!”.

Consider the following file:

H T H H T
T t    t  T h  H

For the input above, your method should produce the following output:

3 heads (60.0%)
You win!

2 heads (33.3%)

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseFifteen {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(FILE_PREFIX + "coinFlip.txt"));
        coinFlip(input);
    }

    public static void coinFlip(Scanner input) {
        while (input.hasNextLine()) {
            Scanner lineScanner = new Scanner(input.nextLine());
            int headsCount = 0;
            int totalCount = 0;
            while (lineScanner.hasNext()) {
                if (lineScanner.next().equalsIgnoreCase("H")) {
                    headsCount++;
                }
                totalCount++;
            }
            System.out.printf("%d heads (%.1f%%)\n", headsCount, 100.0 * headsCount / totalCount);
            if (headsCount > totalCount / 2) {
                System.out.println("You win!");
            }
            System.out.println();
        }
    }
}
