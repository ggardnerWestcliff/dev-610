package assignments.week7.chapter18;

/*
--Exercise 14--
Write a method in the HeapIntPriorityQueue class called toArray that returns the elements of the queue as a filled
array. The order of the elements in the array is not important as long as all elements from the queue are present in
the array, with no extra empty slots before or afterward.

--Exercise 15--
Write a method in the HeapIntPriorityQueue class called toString that returns a string representation of the elements
in the queue, such as "[42, 50, 45, 78, 61]". The order of the elements in the string does not matter as long as they
are all present in the proper format.

--Exercise 16--
Write a method in the HeapIntPriorityQueue class called merge that accepts another HeapIntPriorityQueue as a parameter
and adds all elements from the other queue into the current queue, maintaining proper heap order such that the elements
will still come out in ascending order when they are removed. Your code should not modify the queue passed in as a
parameter. (Recall that objects of the same class can access each other’s private fields.)
*/

import java.util.Arrays;
import java.util.NoSuchElementException;

public class HeapIntPriorityQueue {
    private int[] elementData;
    private int size;

    // Constructs an empty queue.
    public HeapIntPriorityQueue() {
        elementData = new int[10];
        size = 0;
    }

    // Adds the given element to this queue.
    public void add(int value) {
        // resize if necessary
        if (size + 1 >= elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length * 2);
        }

        // insert as new rightmost leaf
        elementData[size + 1] = value;

        // "bubble up" toward root as necessary to fix ordering
        int index = size + 1;
        while (hasParent(index)) {
            int parent = parent(index);
            if (elementData[index] < elementData[parent]) {
                swap(elementData, index, parent(index));
                index = parent(index);
            } else {
                break;  // proper place found; terminate the loop
            }
        }

        size++;
    }

    // Returns true if there are no elements in this queue.
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the minimum value in the queue without modifying the queue.
    // If the queue is empty, throws a NoSuchElementException.
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return elementData[1];
    }

    // Removes and returns the minimum value in the queue.
    // If the queue is empty, throws a NoSuchElementException.
    public int remove() {
        int result = peek();

        // move rightmost leaf to become new root
        swap(elementData, 1, size);
        size--;

        // "bubble down" root as necessary to fix ordering
        bubbleDown(1);
        return result;
    }

    // Swaps the element at the given index as necessary to fix ordering.
    private void bubbleDown(int index) {
        while (hasLeftChild(index)) {
            int left = leftChild(index);
            int right = rightChild(index);
            int child = left;
            if (hasRightChild(index) &&
                    elementData[right] < elementData[left]) {
                child = right;
            }

            if (elementData[index] > elementData[child]) {
                swap(elementData, index, child);
                index = child;
            } else {
                break;  // proper place found; terminate the loop
            }
        }
    }

    // Returns the number of elements in the queue.
    public int size() {
        return size;
    }

    // Exercise 14
    public int[] toArray() {
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = elementData[i];
        }
        return res;
    }

    // Exercise 15
    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += elementData[i];
            if (i < size - 1) {
                res += ", ";
            }
        }
        res += "]";
        return res;
    }

    // Exercise 16
    public void merge(HeapIntPriorityQueue hq) {
        for (int i = 0; i < hq.size; i++) {
            add(hq.elementData[i]);
        }
    }

    // helpers for navigating indexes up/down the tree
    private int parent(int index) {
        return index / 2;
    }

    private int leftChild(int index) {
        return index * 2;
    }

    private int rightChild(int index) {
        return index * 2 + 1;
    }

    private boolean hasParent(int index) {
        return index > 1;
    }

    private boolean hasLeftChild(int index) {
        return leftChild(index) <= size;
    }

    private boolean hasRightChild(int index) {
        return rightChild(index) <= size;
    }

    private void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }


    public static void heapSort(int[] a) {
        HeapIntPriorityQueue pq = new HeapIntPriorityQueue();
        pq.elementData = a;
        pq.size = a.length - 1;

        System.out.println("start : " + Arrays.toString(a));

        for (int i = a.length / 2; i >= 0; i--) {
            pq.bubbleDown(i);
            System.out.println("bubble: " + Arrays.toString(a));
        }
        while (!pq.isEmpty()) {
            pq.remove();
            System.out.println("remove: " + Arrays.toString(a));
        }
    }
}