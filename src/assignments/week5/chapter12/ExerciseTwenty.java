package assignments.week5.chapter12;

/*
--Exercise 20--
Write a recursive method called waysToClimb that takes a positive integer value representing a number of stairs and
prints each unique way to climb a staircase of that height, taking strides of one or two stairs at a time.
Do not use any loops.

Output each way to climb the stairs on its own line, using a 1 to indicate a small stride of 1 stair, and a 2 to
indicate a large stride of 2 stairs. The order in which you output the possible ways to climb the stairs is not
important, so long as you list the right overall set of ways.

For example, the call waysToClimb(3); should produce the following output:

[1, 1, 1]
[1, 2]
[2, 1]

The call waysToClimb(4); should produce the following output:

[1, 1, 1, 1]
[1, 1, 2]
[1, 2, 1]
[2, 1, 1]
[2, 2]
*/

import java.util.ArrayList;

public class ExerciseTwenty {
    public static void main(String[] args) {
        waysToClimb(3);
        waysToClimb(4);
    }

    public static void waysToClimb(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        waysToClimb(n, result);
    }

    public static void waysToClimb(int n, ArrayList<Integer> result) {
        if (n == 0) {
            System.out.println(result);
        }
        if (n >= 1) {
            result.add(1);
            waysToClimb(n - 1, result);
            result.remove(result.size() - 1);
        }
        if (n >= 2) {
            result.add(2);
            waysToClimb(n - 2, result);
            result.remove(result.size() - 1);
        }
    }
}
