package assignments.week2.chapter4;

/*
--Exercise 16--
Write a method called printPalindrome that accepts a Scanner for the console as a parameter,
prompts the user to enter one or more words, and prints whether the entered String is a palindrome
(i.e., reads the same forward as it does backward, like "abba" or "racecar").

For an added challenge, make the code case-insensitive, so that words like “Abba” and “Madam”
will be considered palindromes.

*/

import java.util.Scanner;

public class ExerciseSixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printPalindrome(scanner);
    }

    public static void printPalindrome(Scanner scanner) {
        System.out.print("Enter one or more words: ");
        String input = scanner.nextLine();
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
