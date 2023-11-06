package assignments.week2.chapter3;

/*
--Exercise 3--

Write a method called printPowersOfN that accepts a base and an exponent as arguments and
prints each power of the base from base^0 (1) up to that maximum power, inclusive.
For example, consider the following calls:

printPowersOfN(4, 3);
printPowersOfN(5, 6);
printPowersOfN(–2, 8);

These calls should produce the following output:

1 4 16 64
1 5 25 125 625 3125 15625
1 –2 4 –8 16 –32 64 –128 256

You may assume that the exponent passed to printPowersOfN has a value of 0 or greater.
(The Math class may help you with this problem. If you use it, you may need to cast its results from
double to int so that you don’t see a .0 after each number in your output.
Also try to write this program without using the Math class.)

*/

public class ExerciseThree {
    public static void main(String[] args) {
        printPowersOfN(4, 3);
        printPowersOfN(5, 6);
        printPowersOfN(-2, 8);

        printPowersOfNUsingMath(4, 3);
        printPowersOfNUsingMath(5, 6);
        printPowersOfNUsingMath(-2, 8);
    }

    public static void printPowersOfN(int base, int exponent) {
        for (int i = 0; i <= exponent; i++) {
            int numToPrint = 1;
            for (int j = 0; j < i; j++) {
                numToPrint *= base;
            }
            System.out.print(numToPrint + " ");
        }
        System.out.println();
    }

    // Solution using Math.pow()
    public static void printPowersOfNUsingMath(int base, int exponent) {
        for (int i = 0; i <= exponent; i++) {
            System.out.print((int) Math.pow(base, i) + " ");
        }
        System.out.println();
    }

}
