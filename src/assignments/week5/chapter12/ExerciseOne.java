package assignments.week5.chapter12;

/*
--Exercise 1--
Write a recursive method called starString that accepts an integer as a parameter and prints to the console a string of
stars (asterisks) that is 2^n (i.e., 2 to the nth power) long.

For example,
starString(0) should print * (because 2^0 == 1)
starString(1) should print ** (because 2^1 == 2)
starString(2) should print **** (because 2^2 == 4)
starString(3) should print ******** (because 2^3 == 8)
starString(4) should print **************** (because 2^4 == 16)

The method should throw an IllegalArgumentException if passed a value less than 0.
*/

public class ExerciseOne {
    public static void main(String[] args) {
        starString(0);
        System.out.println();
        starString(1);
        System.out.println();
        starString(2);
        System.out.println();
        starString(3);
        System.out.println();
        starString(4);
    }

    public static void starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be less than 0");
        }
        if (n == 0) {
            System.out.print("*");
        } else {
            starString(n - 1);
            starString(n - 1);
        }
    }
}
