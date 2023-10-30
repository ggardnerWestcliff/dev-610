package assignments.week1.chapter1;

/*
--Exercise 16--

Write a program called Shining that prints the following line of output 1000 times:

All work and no play makes Jack a dull boy.

You should not write a program that uses 1000 lines of source code; use methods to shorten the program.
What is the shortest program you can write that will produce the 1000 lines of output,
using only the material from this chapter?

*/

public class Shining {
    public static void main(String[] args) {
        printStatement200Times();
        printStatement200Times();
        printStatement200Times();
        printStatement200Times();
        printStatement200Times();
    }

    public static void printStatement200Times() {
        printStatement40Times();
        printStatement40Times();
        printStatement40Times();
        printStatement40Times();
        printStatement40Times();
    }

    public static void printStatement40Times() {
        printStatement8Times();
        printStatement8Times();
        printStatement8Times();
        printStatement8Times();
        printStatement8Times();
    }

    public static void printStatement8Times() {
        printStatement4Times();
        printStatement4Times();
    }

    public static void printStatement4Times() {
        printStatement2Times();
        printStatement2Times();
    }

    public static void printStatement2Times() {
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
    }
}
