package assignments.week2.chapter5;

/*
--Exercise 1--

Write a method called showTwos that shows the factors of 2 in a given integer.

For example, consider the following calls:

showTwos(7);
showTwos(18);
showTwos(68);
showTwos(120);

These calls should produce the following output:

7 = 7
18 = 2 * 9
68 = 2 * 2 * 17
120 = 2 * 2 * 2 * 15

*/

public class ExerciseOne {
    public static void main(String[] args) {
        showTwos(7);
        showTwos(18);
        showTwos(68);
        showTwos(120);
        showTwos(4);
    }

    public static void showTwos(int num) {
        System.out.print(num + " = ");
        while (num % 2 == 0 && num != 2) {
            System.out.print("2 * ");
            num /= 2;
        }
        if (num == 2) {
            System.out.println("2");
        } else if (num > 1) {
            System.out.println(num);
        }
    }
}
