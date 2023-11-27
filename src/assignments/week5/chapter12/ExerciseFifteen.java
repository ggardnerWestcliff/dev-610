package assignments.week5.chapter12;

/*
--Exercise 15--
Write a recursive method vowelsToEnd that takes a string as a parameter and returns a string in which all of the vowels
have been moved to the end. The vowels should appear in reverse order of what they were in the original word.

For example, the call of vowelsToEnd("beautifully") should return "btfllyuiuae".
*/

public class ExerciseFifteen {
    public static void main(String[] args) {
        System.out.println(vowelsToEnd("beautifully"));
    }

    public static String vowelsToEnd(String s) {
        if (s.isEmpty()) {
            return "";
        }
        if (isVowel(s.charAt(0))) {
            return vowelsToEnd(s.substring(1)) + s.charAt(0);
        } else {
            return s.charAt(0) + vowelsToEnd(s.substring(1));
        }
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
