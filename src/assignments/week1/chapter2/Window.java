package assignments.week1.chapter2;

/*
--Exercise 19--

Use your pseudocode from the previous exercise (18) to write a Java program called Window that
produces the preceding figure as output.
Use nested for loops to print the repeated parts of the figure.
Once you get it to work, add a class constant so that the size of the figure can be changed simply
by changing the constant’s value.

*/

public class Window {
    private static final int SIZE = 5;
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            printFrame();
            printGlass();
        }
        printFrame();
    }

    public static void printGlass() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - 1; j++) {
                System.out.print("|");
                for (int k = 0; k < SIZE; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
    }

    public static void printFrame() {
        for (int i = 0; i < SIZE - 1; i ++) {
            System.out.print("+");
            for (int j = 0; j < SIZE; j++) {
                System.out.print("=");
            }
        }
        System.out.println("+");
    }
}
