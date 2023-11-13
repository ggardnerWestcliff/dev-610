package assignments.week3.chapter6;

/*
--Exercise 20--

Write a method called pigLatin that accepts as a parameter a Scanner representing an input file.
Your method should, preserving line breaks, print out the input file’s text in a simplified version of Pig Latin,
a silly English variant where the first letter of each word is moved to the end.

Our rules for translating a word to Pig Latin are as follows:

If the word starts with a vowel (a, e, i, o, or u), append "yay". For example, "elephant" becomes "elephantyay".

If the word starts with a consonant, move the consonant to the end, and append "ay".
For example, "welcome" becomes "elcomeway".

You should also convert every word to lowercase. For example, if the input file contains the following text:

Shall I compare thee to
a summer's day Thou art more
lovely and more temperate

For the preceding input, your method should produce the following console output:

hallsay iyay omparecay heetay otay
ayay ummer'ssay ayday houtay artyay oremay
ovelylay andyay oremay emperatetay

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseTwenty {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(FILE_PREFIX + "pigLatin.txt"));
        pigLatin(input);
    }

    public static void pigLatin(Scanner input) {
        while (input.hasNextLine()) {
            Scanner lineScanner = new Scanner(input.nextLine().toLowerCase());
            while (lineScanner.hasNext()) {
                String token = lineScanner.next();
                if (isVowel(token.substring(0, 1))) {
                    System.out.print(token + "yay");
                } else {
                    token = token.substring(1) + token.charAt(0) + "ay";
                    System.out.print(token);
                }
                if (lineScanner.hasNext()) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isVowel(String c) {
        switch (c) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                return true;
            default:
                return false;
        }
    }
}
