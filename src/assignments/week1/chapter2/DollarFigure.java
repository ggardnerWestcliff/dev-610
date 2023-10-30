package assignments.week1.chapter2;

/*
--Exercise 22--

Write a Java program called DollarFigure that produces the following output.
Use nested for loops to capture the structure of the figure.

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************
*/

public class DollarFigure {
    public static void main(String[] args) {
        int dollarCount = 14;
        for (int i = 1; i <= 7; i++) {
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
