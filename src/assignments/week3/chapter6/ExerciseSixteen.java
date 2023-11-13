package assignments.week3.chapter6;

/*
--Exercise 16--

Write a method called mostCommonNames that accepts a Scanner representing an input file with names on each line
separated by spaces. Some names appear multiple times in a row on the same line.
For each line, print the most commonly occurring name.
If there’s a tie, use the first name that had that many occurrences;
if all names are unique, print the first name on the line.

For example, if the file has this input:

Benson Eric   Eric  Kim  Kim Kim   Jenny  Nancy Nancy  Paul  Paul
Ethan  Jamie Jamie Alyssa Alyssa Helene  Helene Jessica Jessica

For the input above, your method should produce the following output:

Most common: Kim
Most common: Jamie

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseSixteen {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_PREFIX + "mostCommonNames.txt"));
        mostCommonNames(scanner);
    }

    public static void mostCommonNames(Scanner input) {
        while (input.hasNextLine()) {
            Scanner lineScanner = new Scanner(input.nextLine());
            String name = lineScanner.next();
            int nameCount = 1;
            String mostCommonName = name;
            int greatestNameCount = 1;
            while (lineScanner.hasNext()) {
                String nextName = lineScanner.next();
                if (nextName.equals(name)) {
                    nameCount++;
                } else {
                    if (nameCount > greatestNameCount) {
                        mostCommonName = name;
                        greatestNameCount = nameCount;
                    }
                    nameCount = 1;
                }
                name = nextName;
            }
            if (nameCount > greatestNameCount) {
                mostCommonName = name;
            }
            System.out.println("Most common: " + mostCommonName);
        }
    }
}
