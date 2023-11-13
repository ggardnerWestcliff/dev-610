package assignments.week3.chapter6;

/*
--Exercise 19--

Write a method called leetSpeak that accepts two parameters: a Scanner representing an input file, and a PrintStream
representing an output file. Convert the input file’s text to “leet speak,” where various letters are replaced by other
letters/numbers, and output the new text to the given output file.

Replace "o" with "0", "l" (lowercase “L”) with "1" (the number one), "e" with "3", "a" with "4", "t" with "7", and an
"s" at the end of a word with "Z". Preserve the original line breaks from the input.
Also wrap each word of input in parentheses.

For example, if the input file contains the following text:

four score and
seven years ago our
fathers brought forth on this continent
a new nation

For the input above, your method should produce the following in the output file:

(f0ur) (sc0r3) (4nd)
(s3v3n) (y34rZ) (4g0) (0ur)
(f47h3rZ) (br0ugh7) (f0r7h) (0n) (7hiZ) (c0n7in3n7)
(4) (n3w) (n47i0n)

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExerciseNineteen {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(FILE_PREFIX + "leetSpeak.txt"));
        PrintStream output = new PrintStream(new File(FILE_PREFIX + "leetSpeakOutput.txt"));
        leetSpeak(input, output);
    }

    public static void leetSpeak(Scanner input, PrintStream output) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                String token = lineScanner.next();
                token = token.replace("o", "0");
                token = token.replace("l", "1");
                token = token.replace("e", "3");
                token = token.replace("a", "4");
                token = token.replace("t", "7");
                if (token.endsWith("s")) {
                    token = token.substring(0, token.length() - 1) + "Z";
                }
                output.print("(" + token + ")");
                if (lineScanner.hasNext()) {
                    output.print(" ");
                }
            }
            output.println();
        }
    }
}
