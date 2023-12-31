package assignments.week5.chapter12;

/*
--Exercise 2--
Write a method called writeNums that takes an integer n as a parameter and prints to the console the first n integers
starting with 1 in sequential order, separated by commas.

For example, consider the following calls:

writeNums(5);
System.out.println(); // to complete the line of output
writeNums(12);
System.out.println(); // to complete the line of output

These calls should produce the following output:

1, 2, 3, 4, 5
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12

Your method should throw an IllegalArgumentException if passed a value less than 1.

*/

public class ExerciseTwo {
    public static void main(String[] args) {
        writeNums(5);
        System.out.println();
        writeNums(12);
        System.out.println();
        writeNums(1);
    }

    public static void writeNums(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n cannot be less than 1");
        }
        if (n == 1) {
            System.out.print(n);
        } else {
            writeNums(n - 1);
            System.out.print(", ");
            System.out.print(n);
        }
    }
}
