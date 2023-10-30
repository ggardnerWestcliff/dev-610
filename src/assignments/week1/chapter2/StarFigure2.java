package assignments.week1.chapter2;

/*
--Exercise 21--

Modify your StarFigure program (exercise 20) from the previous exercise to become a new program named StarFigure2
that uses a global constant for the figure’s height. (You may want to make loop tables first.)
The previous output used a constant height of 5.
*/

public class StarFigure2 {
    private static final int HEIGHT = 5;

    public static void main(String[] args) {
        int starCount = 0;
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 0; j < (HEIGHT * 4) - (4 * i); j++) {
                System.out.print("/");
            }
            for (int k = 0; k < starCount; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < (HEIGHT * 4) - (4 * i); l++) {
                System.out.print("\\");
            }
            starCount += 8;
            System.out.println();
        }
    }

}
