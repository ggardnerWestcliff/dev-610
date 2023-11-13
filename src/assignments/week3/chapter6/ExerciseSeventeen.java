package assignments.week3.chapter6;

/*
--Exercise 17--

Write a method called inputStats that accepts a Scanner representing an input file and reports the number of lines,
the longest line, the number of tokens on each line, and the length of the longest token on each line.

If the file contains the following text:

Beware the Jabberwock, my son,
the jaws that bite, the claws that catch,
Beware the JubJub bird and shun
the frumious bandersnatch.


For the input above, your method should produce the following output:

Line 1 has 5 tokens (longest = 11)
Line 2 has 8 tokens (longest = 6)
Line 3 has 6 tokens (longest = 6)
Line 4 has 3 tokens (longest = 13)
Longest line: the jaws that bite, the claws that catch,

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseSeventeen {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(FILE_PREFIX + "inputStats.txt"));
        inputStats(input);
    }

    public static void inputStats(Scanner input) {
        int lineCount = 0;
        String longestLine = "";
        while (input.hasNextLine()) {
            int tokenCount = 0;
            int longestTokenLength = 0;
            lineCount++;
            String line = input.nextLine();
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                tokenCount++;
                String token = lineScanner.next();
                if (token.length() > longestTokenLength) {
                    longestTokenLength = token.length();
                }
            }
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
            System.out.printf("Line %d has %d tokens (longest = %d)\n", lineCount, tokenCount, longestTokenLength);
        }
        System.out.println("longest line: " + longestLine);
    }
}
