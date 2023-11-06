package assignments.week2.chapter3;

/*
--Exercise 5--

Write a method called printGrid that accepts two integers representing a number of rows and columns and
prints a grid of integers from 1 to (rows * columns) in column major order. For example, the call

printGrid(4, 6);

should produce the following output:

1 5 9 13 17 21
2 6 10 14 18 22
3 7 11 15 19 23
4 8 12 16 20 24
*/

public class ExerciseFive {
    public static void main(String[] args) {
        printGrid(4, 6);
    }

    public static void printGrid(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(i + (j * rows) + " ");
            }
            System.out.println();
        }
    }
}
