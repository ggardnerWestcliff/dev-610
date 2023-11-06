package assignments.week2.chapter3;

/*
--Exercise 19--

Write a method called printReverse that accepts a string as its parameter and prints the characters in opposite order.
For example, a call of printReverse("hello there!") should print "!ereht olleh".
If the empty string is passed, the method should produce no output.

*/

public class ExerciseNineteen {
    public static void main(String[] args) {
        printReverse("hello there!");

        printReverse("");
    }

    public static void printReverse(String str){
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
