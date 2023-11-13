package assignments.week3.chapter6;

/*
--Exercise 5--

Write a method called collapseSpaces that accepts a Scanner representing an input file as its parameter,
then reads that file and outputs it with all its tokens separated by single spaces, collapsing any sequences of
multiple spaces into single spaces.

For example, consider the following text:

many   spaces   on   this   line!

If this text were a line in the file, the same line should be output as follows:

many spaces on this line!
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseFive {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_PREFIX + "collapseSpaces.txt"));
        collapseSpaces(scanner);
    }

    public static void collapseSpaces(Scanner input) {
        while (input.hasNext()) {
            String token = input.next();
            if (!input.hasNext()) {
                System.out.println(token);
            } else {
                System.out.print(token + " ");
            }
        }
    }
}
