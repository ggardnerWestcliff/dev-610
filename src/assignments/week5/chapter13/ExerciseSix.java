package assignments.week5.chapter13;

/*
--Exercise 6--
To which complexity class does the following algorithm belong?


public static void mystery3(List<String> list) {
    for (int i = 0; i < list.size() – 1; i += 2) {
        String first = list.remove(i);
        list.add(i + 1, first);
    }
}

A: The algorithm belongs to the O(n) complexity class as the runtime is directly proportional to the size of the
   supplied input array.

*/

public class ExerciseSix {
}
