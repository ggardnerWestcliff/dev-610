package assignments.week2.chapter4;

/*
--Exercise 11--

Write a method called longestName that accepts a Scanner for the console and an integer n as parameters and prompts for
n names, then prints the longest name (the name that contains the most characters) in the format shown below,
which might result from a call of longestName(console, 4):

name #1? Roy
name #2? DANE
name #3? sTeFaNiE
name #4? Mariana
Stefanie's name is longest

*/

import java.util.Scanner;

public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        longestName(scanner, 4);
    }

    public static void longestName(Scanner scanner, int n) {
        String longestName = "";
        for (int i = 1; i <= n; i++) {
            System.out.print("Name #" + i + "? ");
            String name = scanner.nextLine();
            if (name.length() > longestName.length()) {
                longestName = name.toLowerCase();
            }
        }
        String longestNameCapitalized = longestName.substring(0, 1).toUpperCase() + longestName.substring(1);
        System.out.println(longestNameCapitalized + "'s name is longest");
    }
}
