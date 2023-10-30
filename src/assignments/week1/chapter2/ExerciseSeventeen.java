package assignments.week1.chapter2;

/*
--Exercise 17--

Modify your SlashFigure program from the previous exercise to become a new program called SlashFigure2
that uses a global constant for the figure’s height.

*/

public class ExerciseSeventeen {
    private static final int HEIGHT = 4;
    private static final int WIDTH = (HEIGHT * 4) - 2;
    public static void main(String[] args) {
        int slashCount = 0;
        for (int i = 0; i < HEIGHT; i++) {
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
