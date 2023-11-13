package assignments.week3.chapter6;

/*
--Exercise 1--

Write a method called boyGirl that accepts a Scanner that is reading its input from a file containing a series of names
followed by integers. The names alternate between boys’ names and girls’ names.
Your method should compute the absolute difference between the sum of the boys’ integers and the sum of the girls’
integers. The input could end with either a boy or girl; you may not assume that it contains an even number of names.

For example, if the input file contains the following text:

Erik 3 Rita 7 Tanner 14 Jillyn 13 Curtis 4 Stefanie 12 Ben 6

Then the method should produce the following console output, since the boys’ sum is 27 and the girls’ sum is 32:

4 boys, 3 girls
Difference between boys’ and girls’ sums: 5

*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseOne {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_PREFIX + "boyGirl.txt"));
        boyGirl(scanner);
    }

    public static void boyGirl(Scanner input) {
        int boyCount = 0;
        int girlCount = 0;
        int boySum = 0;
        int girlSum = 0;
        int counter = 0;
        while (input.hasNext()) {
            input.next();
            if (counter % 2 == 0) {
                boySum += input.nextInt();
                boyCount++;
            } else {
                girlSum += input.nextInt();
                girlCount++;
            }
            counter++;
        }
        System.out.println(boyCount + " boys, " + girlCount + " girls");
        System.out.println("Difference between boys’ and girls’ sums: " + Math.abs(boySum - girlSum));
    }
}
