package assignments.week3.chapter6;

/*
--Exercise 10--
Modify the preceding wordWrap method so that it outputs the newly wrapped text back into the original file.
(Be careful—don’t output into a file while you are reading it!)
Also, modify it to use a class constant for the maximum line length rather than hard-coding 60.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExerciseTen {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";
    public static final int LINE_LENGTH = 60;

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "wordWrap2.txt";
        Scanner input = new Scanner(new File(FILE_PREFIX + fileName));
        wordWrap(input, fileName);
    }

    public static void wordWrap(Scanner input, String fileName) throws FileNotFoundException {
        String strToWrite = "";
        while (input.hasNextLine()) {
            String line = input.nextLine();
            int length = line.length();
            int start = 0;
            int end = LINE_LENGTH;

            while (length > LINE_LENGTH) {
                strToWrite += line.substring(start, end) + "\n";
                start += LINE_LENGTH;
                end += LINE_LENGTH;
                length -= LINE_LENGTH;
            }
            strToWrite += line.substring(start);
            if (input.hasNextLine()) {
                strToWrite += "\n";
            }
        }
        PrintStream output = new PrintStream(new File(FILE_PREFIX + fileName));
        output.println(strToWrite);
    }
}
