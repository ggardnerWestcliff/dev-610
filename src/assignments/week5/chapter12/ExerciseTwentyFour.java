package assignments.week5.chapter12;

/*
--Exercise 24--
Write a recursive method called printSquares to find all ways to express an integer as a sum of squares of unique
positive integers.

For example, the call printSquares(200); should produce the following output:

1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 8^2 + 9^2
1^2 + 2^2 + 3^2 + 4^2 + 7^2 + 11^2
1^2 + 2^2 + 5^2 + 7^2 + 11^2
1^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2
1^2 + 3^2 + 4^2 + 5^2 + 7^2 + 10^2
2^2 + 4^2 + 6^2 + 12^2
2^2 + 14^2
3^2 + 5^2 + 6^2 + 7^2 + 9^2
6^2 + 8^2 + 10^2
Some numbers (such as 128 or 0) cannot be represented as a sum of squares, in which case your method should produce
no output. Keep in mind that the sum has to be formed with unique integers.

Otherwise you could always find a solution by adding 1^2 together until you got to whatever number you are working with.

As with any backtracking problem, this one amounts to a set of choices, one for each integer whose square might or
might not be part of your sum. You may generate the choices by doing a for loop over an appropriate range of numbers.
Note that the maximum possible integer that can be part of a sum of squares for an integer n is the square root of n
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExerciseTwentyFour {
    public static void main(String[] args) {
        printSquares(200);
    }

    public static void printSquares(int n) {
        printSquares(n, 1, new HashSet<>());
    }

    public static void printSquares(int n, int index, Set<Integer> squares) {
        if (n == 0) {
            printSquareSet(squares);
        } else if (n > 0) {
            int root = (int) Math.sqrt(n);
            for (int i = index; i <= root; i++) {
                if (n - i * i >= 0) {
                    squares.add(i);
                    printSquares(n - i * i, i + 1, squares);
                    squares.remove(i);
                }
            }
        }
    }

    public static void printSquareSet(Set<Integer> set) {
        Iterator<Integer> itr = set.iterator();
        System.out.print(itr.next() + "^2");
        while (itr.hasNext()) {
            System.out.print(" + " + itr.next() + "^2");
        }
        System.out.println();
    }
}
