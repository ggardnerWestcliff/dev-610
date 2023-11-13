package assignments.week3.chapter7;

/*
--Exercise 19--

Write a method called wordLengths that accepts a Scanner for an input file as its parameter. Your method should open
the given file, count the number of letters in each token in the file, and output a result diagram of how many words
contain each number of letters. For example, consider a file containing the following text:

Before sorting:
13 23 480 –18 75
hello how are you feeling today

After sorting:
–18 13 23 75 480
are feeling hello how today you

Your method should produce the following output to the console. Use tabs so that the stars line up:

1: 0
2: 6 ******
3: 10 **********
4: 0
5: 5 *****
6: 1 *
7: 2 **
8: 2 **
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseNineteen {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter7/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_PREFIX + "wordLengths.txt"));
        wordLengths(scanner);
    }

    public static void wordLengths(Scanner input) {
        int[] lengths = new int[81];
        int maxLength = 0;
        while (input.hasNext()) {
            String token = input.next();
            lengths[token.length() - 1]++;
            maxLength = Math.max(maxLength, token.length());
        }
        for (int i = 0; i < Math.min(lengths.length, maxLength); i++) {
            System.out.printf("%d: %d\t", i + 1, lengths[i]);
            for (int j = 0; j < lengths[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
