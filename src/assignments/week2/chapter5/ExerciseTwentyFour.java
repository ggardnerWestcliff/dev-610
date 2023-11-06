package assignments.week2.chapter5;

/*
--Exercise 24--
Write a method called isAllVowels that returns whether a string consists entirely of vowels
(a, e, i, o, or u, case-insensitively). If and only if every character of the string is a vowel, your method should
return true. For example, the call isAllVowels("eIEiO") returns true and isAllVowels("oink") returns false.

You should return true if passed the empty string, since it does not contain any non-vowel characters.
*/

public class ExerciseTwentyFour {
    public static void main(String[] args) {
        System.out.println(isAllVowels("eIEiO"));
        System.out.println(isAllVowels("oink"));
        System.out.println(isAllVowels(""));
    }

    public static boolean isAllVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!isVowel(str.toLowerCase().charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
