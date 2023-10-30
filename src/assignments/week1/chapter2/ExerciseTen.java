package assignments.week1.chapter2;

/*
--Exercise 10--

It’s common to print a rotating, increasing list of single-digit numbers at the start of a program’s output as a
visual guide to number the columns of the output to follow.
With this in mind, write nested for loops to produce the following output, with each line 60 characters wide:

         |         |         |         |         |         |
123456789012345678901234567890123456789012345678901234567890

*/

public class ExerciseTen {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 0; i < 60; i++) {
            System.out.print(i % 10);
        }
    }
}
