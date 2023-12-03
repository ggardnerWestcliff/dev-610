package assignments.week6.chapter15;

/*
--Exercise 1--
Write a method called lastIndexOf that accepts an integer as a parameter and returns the index in the list of the last
occurrence of that value, or −1 if the value is not found in the list.
For example, if the list stores [1, 18, 2, 7, 18, 39, 18, 40], then the last index of 18 is 6 and the last index of 3
is -1

--Exercise 2--
Write a method called indexOfSubList that accepts another list L as a parameter and returns the starting index of where
L first appears in this list, or −1 if it is not found. All elements of L must appear in sequence and in the same order.
For example, if variables called list1 and list2 store [11, –7, 3, 42, 0, 14] and [3, 42, 0], respectively, the call of
list1.indexOfSubList(list2) should return 2.

--Exercise 3--
Write a method called replaceAll that accepts two integer values as parameters and replaces all occurrences of the first
value in the list with the second value. For example, if a variable called list stores [11, –7, 3, 42, 3, 0, 14, 3], the
call of list.replaceAll(3, 999); should change the list to store [11, –7, 999, 42, 999, 0, 14, 999].

--Exercise 4--
Write a method called reverse that reverses the order of the elements in the array list. For example, if a variable
called list stores [11, –7, 3, 42, 0, 14, 56], the call of list.reverse(); should change the list to store
[56, 14, 0, 42, 3, –7, 11]. An empty or one-element list is not changed by a call to this method.

--Exercise 5--
Write a method called runningTotal that returns a new ArrayIntList that contains a running total of the original list.
In other words, the ith value in the new list should store the sum of elements 0 through i of the original list.

For example, given a variable list that stores [2, 3, 5, 4, 7, 15, 20, 7],
consider what happens when the following call is made:

ArrayIntList list2 = list.runningTotal();

The variable list2 should store [2, 5, 10, 14, 21, 36, 56, 63]. The original list should not be changed by the method.
If the original list is empty, the result should be an empty list. The new list should have the same capacity as the
original. Remember that there is a list constructor that accepts a capacity as a parameter.

--Exercise 6--
Write a method called fill that accepts an integer value as a parameter and replaces every value in the list with that
value. For example, if a variable called list initially stores [42, –7, 3, 0, 15] and the call of list.fill(2); is
made, the list will be changed to store [2, 2, 2, 2, 2].

--Exercise 7--
Write a method called isPairwiseSorted that returns whether or not a list of integers is pairwise sorted. A list is
considered pairwise sorted if each successive pair of numbers is in nondecreasing order. For example, if a variable
called list stores [3, 8, 2, 5, 19, 24, –3, 0, 4, 4, 8, 205, 42], then the call of list.isPairwiseSorted() should
return true because the successive pairs of this list are all sorted: (3, 8), (2, 5), (19, 24), (–3, 0), (4, 4),
(8, 205). The extra value 42 at the end had no effect on the result because it is not part of a pair. If the list had
instead stored [7, 42, 308, 409, 19, 17, 2], then the method should return false because the pair (19, 17) is not in
sorted order. If a list is so short that it has no pairs, then it is considered to be pairwise sorted.

--Exercise 8--
Write a method called count that accepts an element value as a parameter and returns the number of occurrences of that
value in the list. For example, suppose a variable named list stores [2, -3, 2, 0, 5, 2, 2, 6]. A call of list.count(2)
should return 4 because there are four occurrences of that value in the list.

--Exercise 9--
Write a method called maxCount that returns the number of occurrences of the most frequently occurring value in a sorted
list of integers. Because the list will be sorted, all duplicates will be grouped together, which will make it easier to
count duplicates. For example, if a variable called list stores
[1, 3, 4, 7, 7, 7, 7, 9, 9, 11, 13, 14, 14, 14, 16, 16, 18, 19, 19, 19], the call of list.maxCount() should return 4
because the most frequently occurring value (7) occurs four times. It is possible that there will be a tie for the most
frequently occurring value, but that doesn’t affect the outcome because you are just returning the count, not the value.
If there are no duplicates in the list, then every value will occur exactly once and the max count is 1. If the list is
empty, the method should return 0.

--Exercise 10--
Write a method called longestSortedSequence that returns the length of the longest sorted sequence within a list of
integers. For example, if a variable called list stores [1, 3, 5, 2, 9, 7, –3, 0, 42, 308, 17], then the call of
list.longestSortedSequence() would return 4 because it is the length of the longest sorted sequence within this list
(the sequence –3, 0, 42, 308). If the list is empty, your method should return 0. Notice that for a nonempty list the
method will always return a value of at least 1 because any individual element constitutes a sorted sequence.

--Exercise 11--
Write a method called removeLast that removes and returns the last value from a list of integers. For example, if a
variable called list stores [8, 17, 42, 3, 8], a call of list.removeLast(); should return 8 and change the list’s state
to [8, 17, 42, 3]. The next call would return 3 and remove 3 from the list, and so on. If the list is empty, throw a
NoSuchElementException.

--Exercise 12--
Write a method called removeFront that takes an integer n as a parameter and that removes the first n values from a
list of integers. For example, if a variable called list stores [8, 17, 9, 24, 42, 3, 8] and a call of
list.removeFront(4); is made, the list’s contents should become [42, 3, 8]. You may assume that the parameter value
passed is between 0 and the size of the list inclusive.

--Exercise 13--
Write a method removeAll that accepts an integer value as a parameter and that removes all occurrences of the given
value from the list.

--Exercise 14--
Write a method called printInversions that lists all inversions in a list of integers. An inversion is a pair of numbers
in which the first appears before the second in the list, but the first is greater than the second. Thus, for a sorted
list such as [1, 2, 3, 4] there are no inversions at all, and the method would produce no output. Suppose that a
variable called list stores the values [4, 3, 2, 1]. The call of list.printInversions(); would print many inversions:

(4, 3)
(4, 2)
(4, 1)
(3, 2)
(3, 1)
(2, 1)

The inversions can appear in any order, so this is just one possible correct output. You must reproduce this format
exactly, but the inversions can appear in any order. You may assume that the list has no duplicates.

--Exercise 15--
Write a method called mirror that doubles the size of a list by appending the mirror image of the original sequence to
the end of the list. The mirror image is the same sequence of values in reverse order. For example, if a variable called
list stores [1, 3, 2, 7] and the client calls list.mirror(); then the list should be changed to store
[1, 3, 2, 7, 7, 2, 3, 1]. Notice that it has doubled in size because the original sequence now appears in reverse order
at the end of the list.

--Exercise 16--
Write a method called stutter that replaces every value with two of that value. For example, if the list initially
stores [42, 7, 0, –3, 15], after the call it should store [42, 42, 7, 7, 0, 0, –3, –3, 15, 15].

--Exercise 17--
Write a method called stretch that takes an integer n as a parameter and that increases a list of integers by a factor
of n by replacing each integer in the original list with n copies of that integer. For example, if a variable called
list stores [18, 7, 4, 24, 11] and we make the call of list.stretch(3); the list should be changed to store
[18, 18, 18, 7, 7, 7, 4, 4, 4, 24, 24, 24, 11, 11, 11]. If n is zero or negative, the list should become empty.

--Exercise 18--
Write a method called doubleList that doubles the size of a list by appending a copy of the original sequence to the end
of the list. For example, if the list stores [1, 8, 2, 7], your method should change it to store
[1, 8, 2, 7, 1, 8, 2, 7].

--Exercise 19--
Write a method called compress that replaces every pair of elements in the list with a single element equal to the sum
of the pair. If the list is of odd size, leave the last element unchanged. For example, if the list stores
[1, 7, 3, 9, 4, 6, 5], your method should change it to store [8, 12, 10, 5] (1 + 7, then 3 + 9, then 4 + 6, then 5).

--Exercise 20--
Write a method called rotate that moves the value at the front of a list of integers to the end of the list.
For example, if a variable called list stores [8, 23, 19, 7, 12, 4], the call of list.rotate(); should move the value
8 from the front of the list to the back of the list, producing [23, 19, 7, 12, 4, 8].

--Exercise 21--
Write a method called switchPairs that switches the order of values in the list in a pairwise fashion. Your method
should switch the order of the first two values, then switch the order of the next two, switch the order of the next
two, and so on. If the list contains an odd number of values, the final element is not moved. For example, if the list
initially stores [10, 25, 31, 47, 52, 68, 77], your method should switch the first pair (10 and 25), the second pair
(31 and 47), and the third pair (52 and 68) to yield [25, 10, 47, 31, 68, 52, 77].

--Exercise 22--
Write a method called fromCounts that converts an ArrayIntList of counts into a new ArrayIntList of values as follows.
Assume that the list stores a sequence of integer pairs that each pair indicates a count and a number.
For example, suppose that an ArrayIntList called list stores [5, 2, 2, -5, 4, 3, 2, 4, 1, 1, 1, 0, 2, 17].
We will interpret this sequence of pairs to mean that you have 5 occurrences of 2, followed by two occurrences of −5
followed by 4 occurrences of 3, and so on. So the call of:

ArrayIntList list2 = list.fromCounts();
should cause the variable list2 to store [2, 2, 2, 2, 2, -5, -5, 3, 3, 3, 3, 4, 4, 1, 0, 17, 17].
*/

import java.util.*;

public class ArrayIntList {
    public int sum() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += elementData[i];
        }
        return total;
    }

    public double average() {
        if (isEmpty()) {
            return 0.0;
        } else {
            return (double) sum() / size;
        }
    }

    private int[] elementData; // list of integers
    private int size;          // current number of elements in the list

    public static final int DEFAULT_CAPACITY = 100;

    // post: constructs an empty list of default capacity
    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    // pre : capacity >= 0 (throws IllegalArgumentException if not)
    // post: constructs an empty list with the given capacity
    public ArrayIntList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        elementData = new int[capacity];
        size = 0;
    }

    // post: returns the current number of elements in the list
    public int size() {
        return size;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: returns the integer at the given index in the list
    public int get(int index) {
        checkIndex(index);
        return elementData[index];
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    // post: returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // post: returns the position of the last occurrence of the given
    //        value (-1 if not found)
    public int lastIndexOf(int value) {
        for (int i = size - 1; i >= 0; i--) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // post: returns the starting index of a given sublist (-1 if not found).
    public int indexOfSubList(ArrayIntList other) {
        for (int i = 0; i <= size - other.size(); i++) {
            boolean found = true;
            for (int j = 0; j < other.size(); j++) {
                if (elementData[i + j] != other.elementData[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }

    // post: returns true if list is empty, false otherwise
    public boolean isEmpty() {
        return size == 0;
    }

    // post: returns true if the given value is contained in the list,
    //       false otherwise
    public boolean contains(int value) {
        return indexOf(value) >= 0;
    }

    // pre : size() < capacity (throws IllegalStateException if not)
    // post: appends the given value to the end of the list
    public void add(int value) {
        ensureCapacity(size + 1);
        elementData[size] = value;
        size++;
    }

    // pre : size() < capacity (throws IllegalStateException if not) &&
    //       0 <= index <= size() (throws IndexOutOfBoundsException if not)
    // post: inserts the given value at the given index, shifting subsequent
    //       values right
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: removes value at the given index, shifting subsequent values left
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: replaces the integer at the given index with the given value
    public void set(int index, int value) {
        checkIndex(index);
        elementData[index] = value;
    }

    // post: list is empty
    public void clear() {
        size = 0;
    }

    // pre: size() + other.size() <= capacity (throws IllegalStateException
    //      if not)
    // post: appends all values in the given list to the end of this list
    public void addAll(ArrayIntList other) {
        ensureCapacity(size + other.size);
        for (int i = 0; i < other.size; i++) {
            add(other.elementData[i]);
        }
    }

    // post: accepts two integer values as parameters and replaces all occurrences of the first value
    //       in the list with the second value.
    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == oldValue) {
                elementData[i] = newValue;
            }
        }
    }

    // post: reverses the order of the elements in the array list.
    public void reverse() {
        if (size < 2) {
            return;
        }
        for (int i = 0; i < size / 2; i++) {
            int a = elementData[i];
            elementData[i] = elementData[size - i - 1];
            elementData[size - i - 1] = a;
        }
    }

    // post: returns a new ArrayIntList that contains a running total of the original list.
    public ArrayIntList runningTotal() {
        ArrayIntList list = new ArrayIntList(size);
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += elementData[i];
            list.add(total);
        }
        return list;
    }

    // post: replaces every value in the list with that value.
    public void fill(int value) {
        for (int i = 0; i < size; i++) {
            elementData[i] = value;
        }
    }

    // post: returns a boolean value indicating if the list is pairwise sorted.
    public boolean isPairwiseSorted() {
        for (int i = 0; i < size - 1; i += 2) {
            if (elementData[i] > elementData[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // post: returns an integer representing the number of occurrences of the given value in the list.
    public int count(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                count++;
            }
        }
        return count;
    }

    // post: returns an integer representing the number of occurrences of the most frequently occurring
    //       value in the list.
    public int maxCount() {
        int maxCount = 0;
        for (int i = 0; i < size; i++) {
            int count = count(elementData[i]);
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    // post: returns an integer representing the length of the longest sorted sequence within the list.
    public int longestSortedSequence() {
        int length = 0;
        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (elementData[j] > elementData[j - 1]) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > length) {
                length = count;
            }
        }
        return length;
    }

    // pre: size = 0 throw NoSuchElementException
    // post: returns the last value in the list.
    public int removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int last = elementData[size - 1];
        remove(size - 1);
        return last;
    }

    // post: removes the first n elements from the list.
    public void removeFront(int n) {
        for (int i = 0; i < n; i++) {
            remove(0);
        }
    }

    // post: removes all occurrences of a given element from the list.
    public void removeAll(int n) {
        while (contains(n)) {
            remove(indexOf(n));
        }
    }

    // post: prints all integer inversion pairs to the console.
    public void printInversions() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (elementData[i] > elementData[j]) {
                    System.out.println("(" + elementData[i] + "), (" + elementData[j] + ")");
                }
            }
        }
    }

    // post: appends a mirrored version of the existing list to the end of the list.
    public void mirror() {
        for (int i = size - 1; i >= 0; i--) {
            add(elementData[i]);
        }
    }

    // post: repeats each element in the list twice.
    public void stutter() {
        for (int i = 0; i < size; i+=2) {
            add(i, elementData[i]);
        }
    }

    // post: repeats each element in the list n times.
    public void stretch(int n) {
        if (n <= 0) {
            clear();
        } else {
            int oldSize = size;
            for (int i = 0; i < oldSize; i++) {
                for (int j = 1; j < n; j++) {
                    add(n * i + j, elementData[n * i]);
                }
            }
        }
    }

    // post: appends the current list to itself.
    public void doubleList() {
        int oldSize = size;
        for (int i = 0; i < oldSize; i++) {
            add(elementData[i]);
        }
    }

    // post: sums each integer pair in the list and replaces the two values with a single sum value.
    public void compress() {
        for (int i = 0; i < size - 1; i++) {
            elementData[i] = elementData[i] + elementData[i + 1];
            remove(i + 1);
        }
    }

    // post: removes the first value in the list and appends it to the end.
    public void rotate() {
        if (size > 0) {
            add(elementData[0]);
            remove(0);
        }
    }

    // post: switches each integer pair in the list.
    public void switchPairs() {
        for (int i = 0; i < size - 1; i += 2) {
            int temp = elementData[i];
            elementData[i] = elementData[i + 1];
            elementData[i + 1] = temp;
        }
    }

    // post: returns an ArrayIntList comprised of integers repeated by their corresponding counts.
    public ArrayIntList fromCounts() {
        ArrayIntList list = new ArrayIntList();
        for (int i = 0; i < size; i += 2) {
            for (int j = 0; j < elementData[i]; j++) {
                list.add(elementData[i + 1]);
            }
        }
        return list;
    }

    // post: returns an iterator for this list
    public ArrayIntListIterator iterator() {
        return new ArrayIntListIterator(this);
    }

    // post: ensures that the underlying array has the given capacity; if not,
    //       the size is doubled (or more if given capacity is even larger)
    public void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int newCapacity = elementData.length * 2 + 1;
            if (capacity > newCapacity) {
                newCapacity = capacity;
            }
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    // post: throws an IndexOutOfBoundsException if the given index is
    //       not a legal index of the current list
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }
}
