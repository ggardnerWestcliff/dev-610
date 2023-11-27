package assignments.week5.chapter12;

/*
--Exercise 11--
Write a recursive method called repeat that accepts a string s and an integer n as parameters and that returns s
concatenated together n times.

For example, repeat("hello", 3) returns "hellohellohello", and repeat("ok", 1) returns "ok", and
repeat("bye", 0) returns "".

String concatenation is an expensive operation, so for an added challenge try to solve this problem while performing
fewer than n concatenations.

*/

public class ExerciseEleven {
    public static void main(String[] args) {
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("ok", 1));
        System.out.println(repeat("bye", 0));
    }

    public static String repeat(String s, int n) {
        String result = "";
        if (n == 0) {
            return result;
        }
        for (int i = 0; i < (n % 10) - 1; i++) {
            result += s;
        }
        if (n >= 10) {
            for (int i = 0; i < 9; i++) {
                s += s;
            }
        }
        return result + s + repeat(s, n / 10);
    }
}
