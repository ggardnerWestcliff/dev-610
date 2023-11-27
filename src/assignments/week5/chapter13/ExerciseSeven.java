package assignments.week5.chapter13;

/*
--Exercise 7--
To which complexity class does the following algorithm belong?


public static void mystery4(List<String> list) {
    for (int i = 0; i < list.size() – 1; i += 2) {
        String first = list.get(i);
        list.set(i, list.get(i + 1));
        list.set(i + 1, first);
    }
}

A: The algorithm belongs to complexity class O(N) as the length of execution of the algorithm is directly proportional
   to the size of the supplied input array.
*/

public class ExerciseSeven {
}
