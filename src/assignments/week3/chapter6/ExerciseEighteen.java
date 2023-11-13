package assignments.week3.chapter6;

/*
--Exercise 18--

Write a method called plusScores that accepts a Scanner representing an input file containing a series of lines that
represent student records. Each student record takes up two lines of input. The first line has the student’s name and
the second line has a series of plus and minus characters.

Below is a sample input:

Kane, Erica
--+-+
Chandler, Adam
++-+
Martin, Jake
+++++++

For each student you should produce a line of output with the student’s name followed by a colon followed by the
percent of plus characters.

For the input above, your method should produce the following output:

Kane, Erica: 40.0% plus
Chandler, Adam: 75.0% plus
Martin, Jake: 100.0% plus

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseEighteen {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(FILE_PREFIX + "plusScores.txt"));
        plusScores(input);
    }

    public static void plusScores(Scanner input) {
        while (input.hasNextLine()) {
            String name = input.nextLine();
            String plusScores = input.nextLine();
            int plusCount = 0;
            for (int i = 0; i < plusScores.length(); i++) {
                if (plusScores.charAt(i) == '+') {
                    plusCount++;
                }
            }
            System.out.printf("%s : %.1f%% plus\n", name, 100.0 * plusCount / plusScores.length());
        }
    }
}
