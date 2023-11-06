package assignments.week2.chapter5;

/*
--Exercise 3--
Write a method called toBinary that accepts an integer as a parameter and returns a String containing that integer’s
binary representation.

For example, the call of printBinary(44) should return "101100".

*/

public class ExerciseThree {
    public static void main(String[] args) {
        System.out.println(toBinary(44));
        System.out.println(toBinary(0));
        System.out.println(toBinary(1));
        System.out.println(toBinary(2));
    }

    public static String toBinary(int val) {
        String result = "";
        result = val % 2 + result;
        val /= 2;
        while (val != 0) {
            result = val % 2 + result;
            val /= 2;
        }
        return result;
    }
}
