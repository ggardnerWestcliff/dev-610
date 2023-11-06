package assignments.week2.chapter5;

/*
--Exercise 25--
Write a method called charsSorted that accepts a string as its parameter and returns true if the characters in the
string appear in sorted alphabetical order. For example, the calls of charsSorted("abcde") and charsSorted("bins")
should return true, but the call of charsSorted("beads") should return false.
*/

public class ExerciseTwentyFive {
    public static void main(String[] args) {
        System.out.println(charsSorted("abcde"));
        System.out.println(charsSorted("bins"));
        System.out.println(charsSorted("beads"));
        System.out.println(charsSorted(""));
    }

    public static boolean charsSorted(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
