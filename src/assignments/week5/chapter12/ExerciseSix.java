package assignments.week5.chapter12;

/*
--Exercise 6--
Write a recursive method called writeSquares that accepts an integer parameter n and prints the first n squares
separated by commas, with the odd squares in descending order followed by the even squares in ascending order.

For example, writeSquares(8); prints the following output:

49, 25, 9, 1, 4, 16, 36, 64

A call of writeSquares(1); prints 1.

The method should throw an IllegalArgumentException if it is passed a value less than 1.
*/

public class ExerciseSix {
    public static void main(String[] args) {
        writeSquares(8);
        System.out.println();
        writeSquares(1);
    }

    public static void writeSquares(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n cannot be less than 1");
        } else if (n == 1) {
            System.out.print(1);
        } else if (n % 2 != 0) {
            System.out.print(n * n + ", ");
            writeSquares(n - 2);
            System.out.print(", " + (n - 1) * (n - 1));
        } else {
            System.out.print((n - 1) * (n - 1));
            if (n != 2) {
                System.out.print(", ");
                writeSquares(n - 2);
            }
            System.out.print(", " + n * n);
        }
    }
}
