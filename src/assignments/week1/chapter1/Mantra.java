package assignments.week1.chapter1;

/*
--Exercise 7--

Write a complete Java program called Mantra that prints the following output.
Use at least one static method besides main.

There's one thing every coder must understand:
The System.out.println command.

There's one thing every coder must understand:
The System.out.println command.

*/

public class Mantra {
    public static void main(String[] args) {
        printMantra();
        System.out.println();
        printMantra();
    }

    public static void printMantra() {
        System.out.println("There's one thing every coder must understand:\nThe System.out.println command.");
    }
}
