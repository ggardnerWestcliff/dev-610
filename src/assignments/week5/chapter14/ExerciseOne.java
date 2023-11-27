package assignments.week5.chapter14;

/*
--Exercise 1--
Write a method called splitStack that accepts a stack of integers as a parameter and rearranges its elements so that
all the negatives appear on the bottom of the stack and all the nonnegatives appear on the top. If after this method is
called you were to pop numbers off the stack, you would first get all the nonnegative numbers and then get all the
negative numbers. It does not matter what order the numbers appear in as long as all the negatives appear lower in the
stack than all the nonnegatives.

For example, if the stack stores [3, −5, 1, 2, −4], an acceptable result from your method would be [−5, −4, 3, 1, 2].

Use a single queue as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseOne {
    public static void main(String[] args) {
        int[] tmp = {3, -5, 1, 2, -4};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        splitStack(stack);
        System.out.println(stack);
    }

    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        int size = queue.size();

        for (int i = 0; i < size; i++) {
            int num = queue.remove();
            if (num < 0) {
                stack.push(num);
            } else {
                queue.add(num);
            }
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
    }
}
