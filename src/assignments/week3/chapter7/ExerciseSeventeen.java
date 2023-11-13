package assignments.week3.chapter7;

/*
--Exercise 17--
Write a method called vowelCount that accepts a String as a parameter and produces and returns an array of integers
representing the counts of each vowel in the string.
The array returned by your method should hold five elements:
    the first is the count of As,
    the second is the count of Es,
    the third Is,
    the fourth Os,
    and the fifth Us.
Assume that the string contains no uppercase letters.

For example, the call vowelCount("i think, therefore i am") should return the array [1, 3, 3, 1, 0].
*/


import java.util.Arrays;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(vowelCount("i think, therefore i am")));
    }

    public static int[] vowelCount(String str) {
        int[] vowels = {0, 0, 0, 0, 0};
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    vowels[0]++;
                    break;
                case 'e':
                    vowels[1]++;
                    break;
                case 'i':
                    vowels[2]++;
                    break;
                case 'o':
                    vowels[3]++;
                    break;
                case 'u':
                    vowels[4]++;
                    break;
            }
        }
        return vowels;
    }
}
