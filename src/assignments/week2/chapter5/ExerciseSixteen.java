package assignments.week2.chapter5;

/*
--Exercise 16--
Write a method called anglePairs that accepts three angles (integers), measured in degrees, as parameters and returns
whether or not there exist both complementary and supplementary angles among the three angles passed.
Two angles are complementary if their sum is exactly 90 degrees; two angles are supplementary if their sum is
exactly 180 degrees. Therefore, the method should return true if any two of the three angles add up to 90 degrees and
also any two of the three angles add up to 180 degrees. For example, the call anglePairs(120, 60, 30) returns true.

Assume that each angle passed is nonnegative.
*/

public class ExerciseSixteen {
    public static void main(String[] args) {
        System.out.println(anglePairs(120, 60, 30));
        System.out.println(anglePairs(120, 60, 60));
        System.out.println(anglePairs(130, 50, 40));
    }

    public static boolean anglePairs(int a, int b, int c) {
        return complementaryAngles(a, b, c) && supplementaryAngles(a, b, c);
    }

    public static boolean complementaryAngles(int a, int b, int c) {
        return (a + b == 90) || (a + c == 90) || (b + c == 90);
    }

    public static boolean supplementaryAngles(int a, int b, int c) {
        return (a + b == 180) || (a + c == 180) || (b + c == 180);
    }
}
