package assignments.week5.chapter14;

/*
--Exercise 12--
Write a method called shift that accepts a stack of integers and an integer n as parameters and that shifts n values
from the bottom of the stack to the top of the stack.

For example, if the stack named s stores [1, 2, 3, 4, 5, 6, 7, 8], and we make the call shift(s, 3);
your method should shift the three values at the bottom of the stack to the top of the stack and leave the other
values in the same order, producing [4, 5, 6, 7, 8, 3, 2, 1]. Notice that the value that was at the bottom of the
stack is now at the top, the value that was second from the bottom is now second from the top, the value that was
third from the bottom is now third from the top, and that the five values not involved in the shift are now at the
bottom of the stack in their original order.

Use one queue as auxiliary storage.
You may assume that the parameter n is ≥ 0 and not larger than the number of elements in the stack.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseTwelve {

    public static void main(String[] args) {
        int[] tmp = {1, 2, 3, 4, 5, 6, 7, 8};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        shift(stack, 3);
        System.out.println(stack);
    }

    public static void shift(Stack<Integer> stack, int n) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int countToPop = stack.size() - n;

        while (countToPop > 0) {
            queue.add(stack.pop());
            countToPop--;
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
