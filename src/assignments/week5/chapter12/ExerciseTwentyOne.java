package assignments.week5.chapter12;

/*
--Exercise 21--
Write a recursive method called countBinary that accepts an integer n as a parameter and that prints all binary numbers
that have exactly n digits in ascending order, each on its own line. All n digits should be shown for all numbers,
including leading zeros if necessary. Assume that n is nonnegative. If n is 0, a blank line should be produced.

Call	            Output
countBinary(1);	    0
                    1
countBinary(2);	    00
                    01
                    10
                    11
countBinary(3);	    000
                    001
                    010
                    011
                    100
                    101
                    110
                    111
*/

public class ExerciseTwentyOne {
    public static void main(String[] args) {
        countBinary(1);
        System.out.println();
        countBinary(2);
        System.out.println();
        countBinary(3);
    }

    public static void countBinary(int n) {
        String result = "";
        countBinary(n, result);
    }

    public static void countBinary(int n, String result) {
        if(n == 0) {
            System.out.println(result);
            return;
        }
        countBinary(n - 1, result + "0");
        countBinary(n - 1, result + "1");
    }
}
