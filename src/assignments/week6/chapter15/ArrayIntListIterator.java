package assignments.week6.chapter15;

// The ArrayIntListIterator class provides a set of utilities for iterating
// over an ArrayIntList and possibly removing values from the list.

import java.util.*;

public class ArrayIntListIterator {
    private ArrayIntList list;      // list to iterate over
    private int position;           // current position within the list
    private boolean removeOK;       // whether it's okay to remove now

    // post: constructs an iterator for the given list
    public ArrayIntListIterator(ArrayIntList list) {
        this.list = list;
        position = 0;
        removeOK = false;
    }

    // post: returns true if there are more elements left, false otherwise
    public boolean hasNext() {
        return position < list.size();
    }

    // pre : hasNext() (throws NoSuchElementException if not)
    // post: returns the next element in the iteration
    public int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int result = list.get(position);
        position++;
        removeOK = true;
        return result;
    }

    // pre : next() has been called without a call on remove (throws
    //       IllegalStateException if not)
    // post: removes the last element returned by the iterator
    public void remove() {
        if (!removeOK) {
            throw new IllegalStateException();
        }
        list.remove(position - 1);
        position--;
        removeOK = false;
    }
}