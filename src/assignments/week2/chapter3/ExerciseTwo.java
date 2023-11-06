package assignments.week2.chapter3;

/*
--Exercise 2--

Write a method called printPowersOf2 that accepts a maximum number as an argument and prints each power of 2 from
2^0 (1) up to that maximum power, inclusive. For example, consider the following calls:

printPowersOf2(3);
printPowersOf2(10);

These calls should produce the following output:

1 2 4 8
1 2 4 8 16 32 64 128 256 512 1024

You may assume that the value passed to printPowersOf2 is 0 or greater.
(The Math class may help you with this problem. If you use it, you may need to cast its results from double to
int so that you don’t see a .0 after each number in your output.
Also try to write this program without using the Math class.)

*/

public class ExerciseTwo {
    public static void main(String[] args) {
        printPowersOf2(3);
        printPowersOf2(10);

        printPowersOf2UsingMath(3);
        printPowersOf2UsingMath(10);
    }

    public static void printPowersOf2(int maxPower) {
        for (int i = 0; i <= maxPower; i++) {
            int numToPrint = 1;
            for (int j = 0; j < i; j++) {
                numToPrint *= 2;
            }
            System.out.print(numToPrint + " ");
        }
        System.out.println();
    }

    // Solution using Math.pow()
    public static void printPowersOf2UsingMath(int maxPower) {
        for (int i = 0; i <= maxPower; i++) {
            int numToPrint = (int) Math.pow(2, i);
            System.out.print(numToPrint + " ");
        }
        System.out.println();
    }
}
