package assignments.week2.chapter3;

/*
--Exercise 23--

Write a method called printIndexed that accepts a string as its parameter and prints the string’s characters
in order followed by their indexes in reverse order.

For example, the call of printIndexed("ZELDA") should print Z4E3L2D1A0 to the console.

*/

public class ExerciseTwentyThree {
    public static void main(String[] args) {
        printIndexed("ZELDA");
    }

    public static void printIndexed(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            System.out.print(str.length() - i - 1);
        }
        System.out.println();
    }
}
