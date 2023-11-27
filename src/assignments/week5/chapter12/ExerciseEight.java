package assignments.week5.chapter12;

/*
--Exercise 8--
Write a recursive method called multiplyEvens that returns the product of the first n even integers.

For example, multiplyEvens(1) returns 2 and multiplyEvens(4) returns 384 (because 2 * 4 * 6 * 8 = 384).

The method should throw an IllegalArgumentException if it is passed a value less than or equal to 0.
*/

public class ExerciseEight {
    public static void main(String[] args) {
        System.out.println(multiplyEvens(1));
        System.out.println(multiplyEvens(4));
    }

    public static int multiplyEvens(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n cannot be less than or equal to 0.");
        } else if (n == 1) {
            return 2;
        } else {
            return 2 * n * multiplyEvens(n - 1);
        }
    }
}
