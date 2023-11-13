package assignments.week3.chapter7;

/*
--Exercise 6--

Write a method called stdev that returns the standard deviation of an array of integers.
Standard deviation is computed by taking the square root of the sum of the squares of the differences between each
element and the mean, divided by one less than the number of elements. (It’s just that simple!)
More concisely and mathematically, the standard deviation of an array `a` is written as follows:

stdev(a) = sqrt(sum(i=1..n) (a[i] – mean(a))^2 / (n-1))

For example, if the array passed contains the values [1, –2, 4, –4, 9, –6, 16, –8, 25, –10],
your method should return approximately 11.237.

*/

public class ExerciseSix {
    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(stdev(arr));
    }

    public static double stdev(int[] arr) {
        double sum = 0;
        double arrMean = mean(arr);
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i] - arrMean, 2);
        }
        return Math.sqrt(sum / (arr.length - 1));
    }

    public static double mean(int[] arr) {
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return (arrSum * 1.0) / arr.length;
    }
}
