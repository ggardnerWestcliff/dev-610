package assignments.week2.chapter4;

/*
--Exercise 18--

Write a method called wordCount that accepts a String as its parameter and returns the number of words in the String.
A word is a sequence of one or more nonspace characters (any character other than ' ').

For example, the call wordCount("hello") should return 1, the call wordCount("how are you?") should return 3,
the call wordCount(" this string has wide spaces ") should return 5, and the call wordCount(" ") should return 0.
*/

public class ExerciseEighteen {
    public static void main(String[] args) {
        System.out.println(wordCount("hello"));
        System.out.println(wordCount("how are you?"));
        System.out.println(wordCount(" this string has wide spaces "));
        System.out.println(wordCount(" "));
    }

    public static int wordCount(String str) {
        String[] words = str.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                count++;
            }
        }
        return count;
    }
}
