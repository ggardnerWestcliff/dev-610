package assignments.week2.chapter5;

/*
--Exercise 15--
Write a method called dominant that accepts three integers as parameters and returns true if any one of the three
integers is larger than the sum of the other two integers. The integers might be passed in any order, so the largest
value could be any of the three. For example, the call dominant(4, 9, 2) returns true because 9 is larger than4 + 2.
Assume that none of the numbers is negative.
*/

public class ExerciseFifteen {
    public static void main(String[] args) {
        System.out.println(dominant(4, 9, 2));
        System.out.println(dominant(9, 4, 2));
        System.out.println(dominant(4, 2, 9));
        System.out.println(dominant(2, 6, 4));
    }

    public static boolean dominant(int a, int b, int c) {
        return a > b + c || b > a + c || c > a + b;
    }
}
