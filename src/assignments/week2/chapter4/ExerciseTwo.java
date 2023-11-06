package assignments.week2.chapter4;

/*
--Exercise 2--

Write a method called repl that accepts a String and a number of repetitions as parameters and returns the
String concatenated that many times.

For example, the call repl("hello", 3) should return "hellohellohello".

If the number of repetitions is zero or less, the method should return an empty string.

*/

public class ExerciseTwo {
    public static void main(String[] args) {
        String str = repl("hello", 3);
        System.out.println(str);

        String str1 = repl("hello", 0);
        System.out.println(str1);
    }

    public static String repl(String str, int num){
        String result = "";
        for (int i = 0; i < num; i++) {
            result += str;
        }
        return result;
    }
}
