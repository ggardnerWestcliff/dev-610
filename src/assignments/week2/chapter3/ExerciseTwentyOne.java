package assignments.week2.chapter3;

/*
--Exercise 21--

Write a method called processName that accepts a Scanner for the console as a parameter and prompts the user to
enter a full name, then prints the name in reverse order (i.e., last name, first name).

Here is an example dialogue with the user:

Please enter your full name: Sammy Jankis
Your name in reverse order is Jankis, Sammy

*/

import java.util.Scanner;

public class ExerciseTwentyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processName(scanner);
    }

    public static void processName(Scanner scanner){
        System.out.print("Please enter your full name: ");
        String name = scanner.nextLine();

        String[] nameArray = name.split(" ");
        String lastName = nameArray[nameArray.length - 1];
        String firstName = nameArray[0];
        System.out.println("Your name in reverse order is " + lastName + ", " + firstName);
    }
}
