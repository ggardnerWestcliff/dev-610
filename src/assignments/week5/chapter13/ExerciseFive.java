package assignments.week5.chapter13;

/*
--Exercise 5--
To which complexity class does the following algorithm belong?


public static void mystery2(int[] list) {
    for (int i = 0; i < list.length / 2; i++) {
        int j = list.length – 1 – i;
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}


A: The algorithm belongs to complexity class O(N) as the length of execution of the algorithm is directly proportional
   to the length of supplied array.
*/

public class ExerciseFive {
}
