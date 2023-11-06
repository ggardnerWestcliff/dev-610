package assignments.week2.chapter3;

/*
--Exercise 18--

Write a method called vertical that accepts a string as its parameter and prints each letter of the string on
separate lines. For example, a call of vertical("hey now") should produce the following output:

h
e
y
n
o
w

*/

public class ExerciseEighteen {
    public static void main(String[] args) {
        vertical("hey now");
    }

    public static void vertical(String s) {
        String cleanString = s.replace(" ", "");
        for (int i = 0; i < cleanString.length(); i++) {
            System.out.println(cleanString.charAt(i));
        }
    }
}
