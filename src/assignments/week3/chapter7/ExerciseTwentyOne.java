package assignments.week3.chapter7;

/*
--Exercise 21--

Write a method called isMagicSquare that accepts a two-dimensional array of integers as a parameter and returns true if
it is a magic square. A square matrix is a magic square if all of its row, column, and diagonal sums are equal.

For example, [[2, 7, 6], [9, 5, 1], [4, 3, 8]] is a square matrix because all eight of the sums are exactly 15.

*/

public class ExerciseTwentyOne {
    public static void main(String[] args) {
        int[][] matrix = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        System.out.println(isMagicSquare(matrix));
        int[][] matrix2 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 5}};
        System.out.println(isMagicSquare(matrix2));
    }

    public static boolean isMagicSquare(int[][] matrix) {
        // Check if matrix is square.
        int diagSum1 = 0;
        int diagSum2 = 0;
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row].length != matrix.length) {
                return false;
            }
            diagSum1 += matrix[row][row];
            diagSum2 += matrix[row][matrix.length - row - 1];
        }
        if (diagSum1 != diagSum2) {
            return false;
        }
        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0;
            int colSum = 0;
            for (int col = 0; col < matrix.length; col++) {
                rowSum += matrix[row][col];
                colSum += matrix[col][row];
            }
            if (rowSum != colSum || colSum != diagSum1) {
                return false;
            }
        }
        return true;


    }
}
