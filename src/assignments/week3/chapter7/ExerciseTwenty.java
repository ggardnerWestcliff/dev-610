package assignments.week3.chapter7;

/*
--Exercise 20--

Write a method called matrixAdd that accepts a pair of two-dimensional arrays of integers as parameters, treats the
arrays as two-dimensional matrices, and returns their sum. The sum of two matrixes A and B is a matrix C, where for
every row i and column j,
Cij = Aij + Bij.

You may assume that the arrays passed as parameters have the same dimensions.
*/

import java.util.Arrays;

public class ExerciseTwenty {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrixAdd(matrix1, matrix2)));
    }

    public static int[][] matrixAdd(int[][] matrix1, int[][] matrix2) {
        int[][] matrix3 = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }
}
