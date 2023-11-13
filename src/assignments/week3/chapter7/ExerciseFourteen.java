package assignments.week3.chapter7;

/*
--Exercise 14--

Write a method called contains that accepts two arrays of integers a1 and a2 as parameters and that returns a boolean
value indicating whether the sequence of elements in a2 appears in a1 (true for yes, false for no).
The sequence must appear consecutively and in the same order.

For example, consider the following arrays:
int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
int[] list2 = {1, 2, 1};

The call of contains(list1, list2) should return true because the sequence of values in list2 [1, 2, 1] is contained in
list1 starting at index 5. If list2 had stored the values [2, 1, 2], the call of contains(list1, list2) would return
false. Any two lists with identical elements are considered to contain each other. Every array contains the empty
array, and the empty array does not contain any arrays other than the empty array itself.

*/

public class ExerciseFourteen {
    public static void main(String[] args) {
        int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
        int[] list2 = {1, 2, 1};
        System.out.println(contains(list1, list2));

        int[] list3 = {1, 2, 3, 4, 5};
        int[] list4 = {1, 2, 3, 4, 5};
        System.out.println(contains(list3, list4));

        int[] list5 = {2, 1, 2};
        System.out.println(contains(list1, list5));
    }

    public static boolean contains(int[] a1, int[] a2) {
        int j = 0;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == a2[j]) {
                j++;
            } else {
                j = 0;
            }
            if (j == a2.length) {
                return true;
            }
        }
        return false;
    }
}
