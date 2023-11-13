package assignments.week3.chapter6;

/*
--Exercise 9--

Write a method called wordWrap that accepts a Scanner representing an input file as its parameter and outputs each line
of the file to the console, word-wrapping all lines that are longer than 60 characters.

For example, if a line contains 112 characters, the method should replace it with two lines:
one containing the first 60 characters and another containing the final 52 characters.

A line containing 217 characters should be wrapped into four lines:
three of length 60 and a final line of length 37.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseNine {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";
    public static final int LINE_LENGTH = 60;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(FILE_PREFIX + "wordWrap.txt"));
        wordWrap(input);
    }

    public static void wordWrap(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            int length = line.length();
            int start = 0;
            int end = LINE_LENGTH;

            while (length > LINE_LENGTH) {
                System.out.println(line.substring(start, end));
                start += LINE_LENGTH;
                end += LINE_LENGTH;
                length -= LINE_LENGTH;
            }
            System.out.println(line.substring(start));
        }
    }
}
