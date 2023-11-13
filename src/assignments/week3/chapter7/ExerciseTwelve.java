package assignments.week3.chapter7;

/*
--Exercise 12--
Write a method called priceIsRight that mimics the guessing rules from the game show The Price Is Right.
The method accepts as parameters an array of integers representing the contestants’ bids and an integer representing a
correct price. The method returns the element in the bids array that is closest in value to the correct price without
being larger than that price.

For example, if an array called bids stores the values [200, 300, 250, 1, 950, 40], the call of priceIsRight(bids, 280)
should return 250, since 250 is the bid closest to 280 without going over 280.

If all bids are larger than the correct price, your method should return –1.
*/

public class ExerciseTwelve {
    public static void main(String[] args) {
        int[] arr = {200, 300, 250, 1, 950, 40};
        System.out.println(priceIsRight(arr, 280));
        int[] arr1 = {400, 500, 600, 700, 800, 900};
        System.out.println(priceIsRight(arr1, 280));
    }

    public static int priceIsRight(int[] arr, int target) {
        sortArray(arr);
        int val = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target) {
                val = arr[i];
            } else {
                return val;
            }
        }
        return val;
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    int c = min;
                    arr[i] = arr[j];
                    arr[j] = c;
                    min = arr[i];
                }
            }
        }
    }

}
