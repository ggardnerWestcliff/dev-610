package assignments.week1.chapter2;

/*
--Exercise 16--

Write a Java program called SlashFigure that produces the following output.
Use nested for loops to capture the structure of the figure.

!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////

*/

public class SlashFigure {
    private static final int WIDTH = 22;
    public static void main(String[] args) {
        int slashCount = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < slashCount / 2; j++) {
                System.out.print("\\");
            }
            for (int k = 0; k < WIDTH - slashCount; k++) {
                System.out.print("!");
            }
            for (int l = 0; l < slashCount / 2; l++) {
                System.out.print("/");
            }
            System.out.println();
            slashCount += 4;
        }
    }
}
