package assignments.week3.chapter6;

/*
--Exercise 11--

Modify the preceding wordWrap method so that it only wraps whole words, never chopping a word in half.
Assume that a word is any whitespace-separated token and that all words are under 60 characters in length.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseEleven {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_PREFIX + "wordWrap.txt"));
        wordWrap(scanner);
    }

    public static void wordWrap(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();

            while (line.length() > 60) {
                int lastSpaceBeforeWrap = line.substring(0, 60).lastIndexOf(" ");
                System.out.println(line.substring(0, lastSpaceBeforeWrap));
                line = line.substring(lastSpaceBeforeWrap + 1);
            }
            System.out.println(line);
        }
    }
}
