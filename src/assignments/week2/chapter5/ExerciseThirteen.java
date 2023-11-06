package assignments.week2.chapter5;

/*
--Exercise 13--
Write a method called consecutive that accepts three integers as parameters and returns true if they are three
consecutive numbers—that is, if the numbers can be arranged into an order such that, assuming some integer k,
the parameters’ values are k, k + 1, and k + 2.
Your method should return false if the integers are not consecutive. Note that order is not significant;
your method should return the same result for the same three integers passed in any order.

For example, the calls consecutive(1, 2, 3), consecutive(3, 2, 4), and consecutive(–10, –8, –9) would return true.
The calls consecutive(3, 5, 7), consecutive(1, 2, 2), and consecutive(7, 7, 9) would return false.
*/

public class ExerciseThirteen {
    public static void main(String[] args) {
        System.out.println(consecutive(1, 2, 3));
        System.out.println(consecutive(3, 2, 4));
        System.out.println(consecutive(-10, -8, -9));
        System.out.println(consecutive(3, 5, 7));
        System.out.println(consecutive(1, 2, 2));
        System.out.println(consecutive(7, 7, 9));
    }

    public static boolean consecutive(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            return false;
        }
        int left = Math.min(a, Math.min(b, c));
        int right = Math.max(a, Math.max(b, c));
        return right - left == 2;
    }
}
