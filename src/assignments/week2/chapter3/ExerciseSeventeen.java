package assignments.week2.chapter3;

/*
--Exercise 17--

Write a method called padString that accepts two parameters: a string and an integer representing a length.
The method should pad the parameter string with spaces until its length is the given length.
For example, padString("hello", 8) should return "hello ".
(This sort of method is useful when trying to print output that lines up horizontally.)
If the string’s length is already at least as long as the length parameter,
your method should return the original string.

For example, padString("congratulations", 10) should return "congratulations".
*/

public class ExerciseSeventeen {
    public static void main(String[] args) {
        String paddedString1 = padString("hello", 8);
        System.out.println(paddedString1);

        String paddedString2 = padString("congratulations", 10);
        System.out.println(paddedString2);
    }

    public static String padString(String str, int length){
        String paddedString = str;
        for (int i = 0; i < length - str.length(); i++) {
            paddedString += " ";
        }
        return paddedString;
    }
}
