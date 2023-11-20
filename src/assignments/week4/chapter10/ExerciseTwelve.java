package assignments.week4.chapter10;

/*
--Exercise 12--
Write a method called markLength4 that accepts an ArrayList of strings as a parameter and that places a string of four
asterisks "****" in front of every string of length 4. For example, suppose that a variable called list contains the
values ["this", "is", "lots", "of", "fun", "for", "Java", "coders"]. The call of markLength4(list); should change the
list to store the values ["****", "this", "is", "****", "lots", "of", "fun", "for", "****", "Java", "coders"].
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseTwelve {
    public static void main(String[] args) {
        String[] words = {"this", "is", "lots", "of", "fun", "for", "Java", "coders"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(words));
        markLength4(arr);
        System.out.println(arr);
    }

    public static void markLength4(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() == 4) {
                arr.add(i, "****");
                i++;
            }
        }
    }
}
