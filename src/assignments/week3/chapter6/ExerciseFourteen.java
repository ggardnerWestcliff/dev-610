package assignments.week3.chapter6;

/*
--Exercise 14--

Write a method called printDuplicates that takes as a parameter a Scanner containing a series of lines.
Your method should examine each line looking for consecutive occurrences of the same token on the same line and print
each duplicated token, along with the number of times that it appears consecutively.
Non-repeated tokens are not printed. You may ignore the case of repetition across multiple lines (such as if a line
ends with a given token and the next line starts with the same token). You may assume that each line of the file
contains at least 1 token of input.

For example, consider the following input:

hello how how are you you you you
I I I am Jack’s Jack’s smirking smirking smirking smirking revenge
bow wow wow yippee yippee  yo yippee  yippee yay yay yay
one fish two fish red fish blue fish
It’s the Muppet Show, wakka wakka wakka

Your method should produce the following output:

how*2 you*4
I*3 Jack's*2 smirking*4
wow*2 yippee*2 yippee*2 yay*3

wakka*3
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseFourteen {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(FILE_PREFIX + "printDuplicates.txt"));
        printDuplicates(input);
    }

    public static void printDuplicates(Scanner input) {
        while (input.hasNextLine()) {
            Scanner lineScanner = new Scanner(input.nextLine());
            String token = lineScanner.next();
            int tokenCount = 1;
            while (lineScanner.hasNext()) {
                String nextToken = lineScanner.next();
                if (nextToken.equals(token)) {
                    tokenCount++;
                } else if (tokenCount > 1) {
                    System.out.print(token + "*" + tokenCount + " ");
                    tokenCount = 1;
                } else {
                    tokenCount = 1;
                }
                token = nextToken;
            }
            if (tokenCount > 1) {
                System.out.print(token + "*" + tokenCount);
            }
            System.out.println();
        }
    }
}
