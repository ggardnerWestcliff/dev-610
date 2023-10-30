package assignments.week1.chapter2;

/*
--Exercise 20--

Write a Java program called StarFigure that produces the following output.
Use nested for loops to capture the structure of the figure.

////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
********************************

*/

public class StarFigure {
    private static final int WIDTH = 32;
    public static void main(String[] args) {
        int starCount = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (WIDTH - starCount) / 2; j++) {
                System.out.print("/");
            }
            for (int k = 0; k < starCount; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < (WIDTH - starCount) / 2; l++) {
                System.out.print("\\");
            }
            starCount += 8;
            System.out.println();
        }
    }
}
