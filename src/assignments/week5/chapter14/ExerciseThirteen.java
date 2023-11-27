package assignments.week5.chapter14;

/*
--Exercise 13--
Write a method called expunge that accepts a stack of integers as a parameter and makes sure that the stack’s elements
are in non-decreasing order from top to bottom, by removing from the stack any element that is smaller than any
element(s) on top of it.

For example, if the stack stores [4, 20, 15, 15, 8, 5, 7, 12, 3, 10, 5, 1], the element values 3, 7, 5, 8, and 4 should
be removed because each has an element above it with a larger value. So your method should change the stack to store
[20, 15, 15, 12, 10, 5, 1].

Notice that now the elements are in non-decreasing order from top to bottom. If the stack is empty or has just one
element, nothing changes.

Use one queue or stack (but not both) as auxiliary storage.
*/

import java.util.Stack;

public class ExerciseThirteen {
    public static void main(String[] args) {
        int[] tmp = {4, 20, 15, 15, 8, 5, 7, 12, 3, 10, 5, 1};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        expunge(stack);
        System.out.println(stack);
    }

    public static void expunge(Stack<Integer> stack) {
        Stack<Integer> storage = new Stack<>();

        if (stack.size() > 1) {
            storage.push(stack.pop());
            while (!stack.isEmpty()) {
                int num = stack.pop();
                if (num >= storage.peek()) {
                    storage.push(num);
                }
            }
            while (!storage.isEmpty()) {
                stack.push(storage.pop());
            }
        }
    }
}
