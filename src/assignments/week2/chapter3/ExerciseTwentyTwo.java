package assignments.week2.chapter3;

/*
--Exercise 22--

Write a program that outputs “The Name Game,” where the user inputs a first and last name and a song is printed
about their first, then last, name.

Use a method to avoid redundancy.

*/

import java.util.Scanner;

public class ExerciseTwentyTwo {
    public static void main(String[] args) {
        String firstName, lastName;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        firstName = input.next();
        System.out.print("Enter your last name: ");
        lastName = input.next();

        singSong(firstName);
        singSong(lastName);
    }

    public static void singSong(String name) {
        System.out.println("Happy birthday to you,");
        System.out.println("Happy birthday to you,");
        System.out.println("Happy birthday dear " + name + ",");
        System.out.println("Happy birthday to you!");
    }
}
