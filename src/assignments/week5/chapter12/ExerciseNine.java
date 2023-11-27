package assignments.week5.chapter12;

/*
--Exercise 9--
Write a recursive method called sumTo that accepts an integer parameter n and returns a real number representing the
sum of the first n reciprocals.

In other words, sumTo(n) returns (1 + 1 / 2 + 1 / 3 + 1 / 4 + ... + 1 / n).

For example, sumTo(2) should return 1.5.

The method should return 0.0 if it is passed the value 0 and throw an IllegalArgumentException if it is
passed a value less than 0.
*/

public class ExerciseNine {
    public static void main(String[] args) {
        System.out.println(sumTo(1));
        System.out.println(sumTo(2));
        System.out.println(sumTo(3));
        System.out.println(sumTo(4));
        System.out.println(sumTo(5));
    }

    public static double sumTo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be less than 0");
        } else if (n == 0) {
            return 0.0;
        } else {
            return 1.0 / n + sumTo(n - 1);
        }
    }
}
