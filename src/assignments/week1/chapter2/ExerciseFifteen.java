package assignments.week1.chapter2;

/*
--Exercise 15--

Write a method called printDesign that produces the following output.
Use nested for loops to capture the structure of the figure.

-----1-----
----333----
---55555---
--7777777--
-999999999-

*/

public class ExerciseFifteen {
    private static final int DESIGN_WIDTH = 11;
    public static void main(String[] args) {
        printDesign();
    }

    public static void printDesign() {
        int numToPrint = 1;
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < (DESIGN_WIDTH - numToPrint) / 2; k++) {
                System.out.print("-");
            }
            for (int j = 0; j < numToPrint; j++) {
                System.out.print(numToPrint);
            }
            for (int k = 0; k < (DESIGN_WIDTH - numToPrint) / 2; k++) {
                System.out.print("-");
            }
            numToPrint += 2;
            System.out.println();
        }
    }
}
