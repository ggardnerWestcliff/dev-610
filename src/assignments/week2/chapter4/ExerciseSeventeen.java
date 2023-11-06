package assignments.week2.chapter4;

/*
--Exercise 17--
Write a method called stutter that accepts a string parameter and returns that string
with its characters repeated twice.

For example, stutter("Hello!") returns "HHeelllloo!!"
*/

public class ExerciseSeventeen {
    public static void main(String[] args) {
        String response = stutter("Hello!");
        System.out.println(response);
    }

    public static String stutter(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) + "" + str.charAt(i);;
        }
        return result;
    }
}
