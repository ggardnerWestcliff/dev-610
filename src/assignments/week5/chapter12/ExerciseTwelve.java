package assignments.week5.chapter12;

/*
--Exercise 12--
Write a recursive method called isReverse that accepts two strings as parameters and returns true if the two strings
contain the same sequence of characters as each other but in the opposite order (ignoring capitalization), and false
otherwise.

For example, the call of isReverse("hello", "eLLoH") would return true.

The empty string, as well as any one-letter string, is considered to be its own reverse.
*/

public class ExerciseTwelve {
    public static void main(String[] args) {
        System.out.println(isReverse("hello", "oLLeH"));
        System.out.println(isReverse("hello", "eLLoH2"));
    }

    public static boolean isReverse(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        if (s1.length() == s2.length()) {
            int length = s2.length();
            if (Character.toUpperCase(s1.charAt(0)) == Character.toUpperCase(s2.charAt(length - 1))) {
                return isReverse(s1.substring(1), s2.substring(0, length - 1));
            } else {
                return false;
            }
        }
        return false;
    }
}
