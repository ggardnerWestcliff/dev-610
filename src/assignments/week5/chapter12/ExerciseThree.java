package assignments.week5.chapter12;

/*
--Exercise 3--
Write a method called writeSequence that accepts an integer n as a parameter and prints to the console a symmetric
sequence of n numbers composed of descending integers that ends in 1, followed by a sequence of ascending integers that
begins with  1.

The following table indicates the output that should be produced for various values of n:

Method call               Output produced
-----------------------------------------
writeSequence(1);         1
writeSequence(2);         1 1
writeSequence(3);         2 1 2
writeSequence(4);         2 1 1 2
writeSequence(5);         3 2 1 2 3
writeSequence(6);         3 2 1 1 2 3
writeSequence(7);         4 3 2 1 2 3 4
writeSequence(8);         4 3 2 1 1 2 3 4
writeSequence(9);         5 4 3 2 1 2 3 4 5
writeSequence(10);        5 4 3 2 1 1 2 3 4 5
Notice that when is odd the sequence has a single 1 in the middle, whereas for even values it has two 1s in the middle.

Your method should throw an IllegalArgumentException if it is passed a value less than 1.

*/

public class ExerciseThree {
    public static void main(String[] args) {
        writeSequence(1);
        System.out.println();
        writeSequence(2);
        System.out.println();
        writeSequence(3);
        System.out.println();
        writeSequence(4);
        System.out.println();
        writeSequence(5);
        System.out.println();
        writeSequence(6);
        System.out.println();
        writeSequence(7);
        System.out.println();
        writeSequence(8);
        System.out.println();
        writeSequence(9);
        System.out.println();
        writeSequence(10);
    }

    public static void writeSequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n cannot be less than 1");
        }
        if (n == 1) {
            System.out.print("1 ");
        } else {
            System.out.print((n + 1) / 2 + " ");
            if (n != 2) {
                writeSequence(n - 2);
            }
            System.out.print((n + 1) / 2 + " ");
        }
    }
}
