package assignments.week3.chapter6;

/*
--Exercise 7--

Write a method called flipLines that accepts a Scanner for an input file and writes to the console the same file’s
contents with each pair of lines reversed in order.
If the file contains an odd number of lines, leave the last line unmodified.

For example, if the file contains:

Twas brillig and the slithy toves
did gyre and gimble in the wabe.
All mimsey were the borogroves,
and the mome raths outgrabe.

your method should produce the following output:

did gyre and gimble in the wabe.
Twas brillig and the slithy toves
and the mome raths outgrabe.
All mimsey were the borogroves,

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseSeven {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_PREFIX + "flipLines.txt"));
        flipLines(scanner);
    }

    public static void flipLines(Scanner input) {
        while (input.hasNextLine()) {
            String line1 = input.nextLine();
            if (!input.hasNextLine()) {
                System.out.println(line1);
                return;
            }
            String line2 = input.nextLine();
            System.out.println(line2 + "\n" + line1);
        }
    }
}
