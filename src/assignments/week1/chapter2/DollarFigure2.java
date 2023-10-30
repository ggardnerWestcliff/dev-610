package assignments.week1.chapter2;

/*
--Exercise 23--

Modify your DollarFigure program (exercise 22) from the previous exercise to become a new program called DollarFigure2
that uses a global constant for the figure’s height. (You may want to make loop tables first.)
The previous output used a constant height of 7.
*/

public class DollarFigure2 {
    private static final int HEIGHT = 10;
    public static void main(String[] args) {
        int dollarCount = HEIGHT * 2;
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 1; j <= (i - 1) * 2; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= dollarCount / 2; k++) {
                System.out.print("$");
            }
            for (int l = 1; l <= dollarCount; l++) {
                System.out.print("*");
            }
            for (int m = 1; m <= dollarCount / 2; m++) {
                System.out.print("$");
            }
            for (int n = 1; n <= (i - 1) * 2; n++) {
                System.out.print("*");
            }
            dollarCount -= 2;
            System.out.println();
        }
    }

}
