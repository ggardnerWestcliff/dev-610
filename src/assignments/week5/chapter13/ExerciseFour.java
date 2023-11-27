package assignments.week5.chapter13;

/*
--Exercise 4--
To which complexity class does the following algorithm belong? Consider N to be the length or size of the array or
collection passed to the method. Explain your reasoning.


public static int[] mystery1(int[] list) {
    int[] result = new int[2 * list.length];
    for (int i = 0; i < list.length; i++) {
        result[2 * i] = list[i] / 2 + list[i] % 2;
        result[2 * i + 1] = list[i] / 2;
    }
    return result;
}

A: The algorithm belongs to complexity class O(N) as the algorithm performs a loop over every item in the supplied array
   indicating that the complexity of the algorithm increases linearly as the size of the provided array increases.

*/

public class ExerciseFour {
}
