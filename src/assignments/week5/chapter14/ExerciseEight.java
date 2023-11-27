package assignments.week5.chapter14;

/*
--Exercise 8--
Write a method called isPalindrome that accepts a queue of integers as a parameter and returns true if the numbers in
the queue are the same in reverse order. For example, if the queue stores [3, 8, 17, 9, 17, 8, 3], your method should
return true because this sequence is the same in reverse order. If the queue stores [3, 17, 9, 4, 17, 3], your method
would return false because this sequence is not the same in reverse order (the 9 and 4 in the middle don’t match).
The empty queue should be considered a palindrome. Your method must restore the parameter queue to its original state
before returning.

Use one stack as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseEight {

    public static void main(String[] args) {
        int[] tmp = {3, 8, 17, 9, 17, 8, 3};
        Queue<Integer> queue = new LinkedList<>();
        for (int i : tmp) {
            queue.add(i);
        }
        System.out.println(isPalindrome(queue));
    }

    public static boolean isPalindrome(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        int queueSize = queue.size();
        boolean eq = true;

        for (int i = 0; i < queueSize; i++) {
            int num = queue.remove();
            queue.add(num);
            stack.push(num);
        }
        for (int i = 0; i < queueSize; i++) {
            int num = queue.remove();
            if (num != stack.pop()) {
                eq = false;
            }
            queue.add(num);
        }
        return eq;
    }
}
