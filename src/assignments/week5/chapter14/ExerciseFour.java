package assignments.week5.chapter14;

/*
--Exercise 4--
Write a method called collapse that accepts a stack of integers as a parameter and that collapses it by replacing each
successive pair of integers with the sum of the pair.

For example, if the stack stores [7, 2, 8, 9, 4, 11, 7, 1, 42], the first pair should be collapsed into 9 (7 + 2),
the second pair should be collapsed into 17 (8 + 9), and so on.
If the stack stores an odd number of elements, such as the 42 at the end of our example stack,
the final element is not collapsed. So for this stack your method would yield [9, 17, 15, 8, 42].

Use one queue as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseFour {
    public static void main(String[] args) {
        int[] tmp = {7, 2, 8, 9, 4, 11, 7, 1, 42};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        collapse(stack);
        System.out.println(stack);
    }

    public static void collapse(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        if (stack.size() % 2 != 0) {
            queue.add(stack.pop());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop() + stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
    }
}
