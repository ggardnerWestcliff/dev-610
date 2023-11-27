package assignments.week5.chapter12;

/*
--Exercise 17--
Write a recursive method called permut that accepts two integers n and r as parameters and returns the number of unique
permutations of r items from a group of n items.

For given values of n and r, this value P(n, r) can be computed as follows:

P(n, r) = n! / (n − r)!
For example, permut(7, 4) should return 840. It may be helpful to note that permut(6, 3) returns 120, or 840 / 7.

*/

public class ExerciseSeventeen {
    public static void main(String[] args) {
        System.out.println(permut(7, 4));
        System.out.println(permut(6, 3));
    }

    public static int permut(int n, int r) {
        if (r == 1) {
            return n;
        }
        return n * permut(n - 1, r - 1);
    }
}
