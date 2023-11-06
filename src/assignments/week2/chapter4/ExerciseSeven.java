package assignments.week2.chapter4;

/*
--Exercise 7--
Write a static method called xo that accepts an integer size as a parameter and prints a square of size
by size characters, where all characters are “o” except that an “x” pattern of “x” characters has been drawn from
the corners of the square.

On the first line, the first and last characters are “x”;
on the second line, the second and second-from-last characters are “x”; and so on.

Here are two example outputs:
xo(5);
xooox
oxoxo
ooxoo
oxoxo
xooox

xo(6);
xoooox
oxooxo
ooxxoo
ooxxoo
oxooxo
xoooox

*/

public class ExerciseSeven {
    public static void main(String[] args) {
        xo(5);
        System.out.println();
        xo(6);
    }

    public static void xo(int size) {
        int leftPointer = 0;
        int rightPointer = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == leftPointer || j == rightPointer) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            leftPointer++;
            rightPointer--;
            System.out.println();
        }
    }
}
