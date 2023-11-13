package assignments.week3.chapter6;

/*
--Exercise 8--

Write a method called doubleSpace that accepts a Scanner for an input file and a PrintStream for an output file as its
parameters, writing into the output file a double-spaced version of the text in the input file.
You can achieve this task by inserting a blank line between each line of output.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExerciseEight {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(FILE_PREFIX + "doubleSpace.txt"));
        PrintStream output = new PrintStream(new File(FILE_PREFIX + "doubleSpaceOutput.txt"));
        doubleSpace(input, output);
    }

    public static void doubleSpace(Scanner input, PrintStream output) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (input.hasNextLine()) {
                output.println(line + "\n");
            } else {
                output.println(line);
            }
        }
    }
}
