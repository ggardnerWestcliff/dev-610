package assignments.week2.chapter4;

/*
--Exercise 22--
Write a method called printAcronym that accepts a string as its parameter and prints the first letter of each word of
the string as an acronym. For example, the call of printAcronym("Breath of the Wild") should print "BotW".
You may assume that the string contains at least one word and does not have any surrounding whitespace
at its start or end.
*/

public class ExerciseTwentyTwo {
    public static void main(String[] args) {
        printAcronym("Breath of the Wild");
        printAcronym("Hello World");
    }

    public static void printAcronym(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(0));
        }
        System.out.println();
    }
}
