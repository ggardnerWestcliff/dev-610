package assignments.week2.chapter3;

/*
--Exercise 1--

Write a method called printNumbers that accepts a maximum number as an argument and prints each number from 1
up to that maximum, inclusive, boxed by square brackets. For example, consider the following calls:

printNumbers(15);
printNumbers(5);
These calls should produce the following output:

[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15]
[1] [2] [3] [4] [5]
You may assume that the value passed to printNumbers is 1 or greater.
*/

public class ExerciseOne {

    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);
    }

    public static void printNumbers(int max) {
        for (int i = 1; i <= max; i++) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
    }
}
