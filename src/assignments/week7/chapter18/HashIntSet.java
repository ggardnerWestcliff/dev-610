package assignments.week7.chapter18;

/*
--Exercise 1--
Write a method in the HashIntSet class called addAll that accepts another hash set as a parameter and adds all of the
elements from the other set into the current set. For example, if the set stores [-5, 1, 2, 3] and the method is passed
[2, 3, 6, 44, 79], your set would store [-5, 1, 2, 3, 6, 44, 79].

--Exercise 2--
Write a method in the HashIntSet class called containsAll that accepts another hash set as a parameter and returns true
if your set contains every element from the other set. For example, if the set stores [-2, 3, 5, 6, 8] and the method is
passed [3, 6, 8], your method would return true. If the method were passed [3, 6, 7, 8], your method would return false
because your set does not contain the value 7.

--Exercise 3--
Write a method in the HashIntSet class called equals that accepts another hash set as a parameter and returns true if
the two sets contain exactly the same elements. The internal hash table size and ordering of the elements does not
matter, only the sets of elements themselves.

--Exercise 4--
Write a method in the HashIntSet class called removeAll that accepts another hash set as a parameter and ensures that
this set does not contain any of the elements from the other set. For example, if the set stores [-2, 3, 5, 6, 8] and
the method is passed [2, 3, 6, 8, 11], your set would store [-2, 5].

--Exercise 5--
Write a method in the HashIntSet class called retainAll that accepts another hash set as a parameter and removes all
elements from this set that are not contained in the other set. For example, if the set stores [-2, 3, 5, 6, 8] and the
method is passed [2, 3, 6, 8, 11], your set would store [3, 6, 8].

--Exercise 6--
Write a method in the HashIntSet class called toArray that returns the elements of the set as a filled array. The order
of the elements in the array is not important as long as all elements from the set are present in the array, with no
extra empty slots before or afterward.

--Exercise 7--
Write a method in the HashIntSet class called toString that returns a string representation of the elements in the set,
such as "[-2, 3, 5, 6, 8]". The order of the elements in the string does not matter as long as they are all present in
the proper format. Do not list any empty or meaningless indexes in the string.

*/

public class HashIntSet {
    private static final double MAX_LOAD_FACTOR = 0.75;
    private HashEntry[] elementData;
    private int size;

    // Constructs an empty set.
    public HashIntSet() {
        elementData = new HashEntry[10];
        size = 0;
    }

    // Adds the given element to this set, if it was not already
    // contained in the set.
    public void add(int value) {
        if (!contains(value)) {
            if (loadFactor() >= MAX_LOAD_FACTOR) {
                rehash();
            }

            // insert new value at front of list
            int bucket = hashFunction(value);
            elementData[bucket] = new HashEntry(value, elementData[bucket]);
            size++;
        }
    }

    // Removes all elements from the set.
    public void clear() {
        for (int i = 0; i < elementData.length; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    // Returns true if the given value is found in this set.
    public boolean contains(int value) {
        int bucket = hashFunction(value);
        HashEntry current = elementData[bucket];
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Returns true if there are no elements in this queue.
    public boolean isEmpty() {
        return size == 0;
    }

    // Removes the given value if it is contained in the set.
    // If the set does not contain the value, has no effect.
    public void remove(int value) {
        int bucket = hashFunction(value);
        if (elementData[bucket] != null) {
            // check front of list
            if (elementData[bucket].data == value) {
                elementData[bucket] = elementData[bucket].next;
                size--;
            } else {
                // check rest of list
                HashEntry current = elementData[bucket];
                while (current.next != null && current.next.data != value) {
                    current = current.next;
                }

                // if the element is found, remove it
                if (current.next != null && current.next.data == value) {
                    current.next = current.next.next;
                    size--;
                }
            }
        }
    }

    // Returns the number of elements in the queue.
    public int size() {
        return size;
    }


    // Returns the preferred hash bucket index for the given value.
    private int hashFunction(int value) {
        return Math.abs(value) % elementData.length;
    }

    private double loadFactor() {
        return (double) size / elementData.length;
    }

    // Resizes the hash table to twice its former size.
    private void rehash() {
        // replace element data array with a larger empty version
        HashEntry[] oldElementData = elementData;
        elementData = new HashEntry[2 * oldElementData.length];
        size = 0;

        // re-add all of the old data into the new array
        for (int i = 0; i < oldElementData.length; i++) {
            HashEntry current = oldElementData[i];
            while (current != null) {
                add(current.data);
                current = current.next;
            }
        }
    }

    // Exercise 1
    public void addAll(HashIntSet other) {
        for (int i = 0; i < other.elementData.length; i++) {
            HashEntry node = other.elementData[i];
            while(node != null) {
                add(node.data);
                node = node.next;
            }
        }
    }

    // Exercise 2
    public boolean containsAll(HashIntSet other) {
        for (int i = 0; i < other.elementData.length; i++) {
            HashEntry current = other.elementData[i];
            while(current != null) {
                if (!contains(current.data))
                    return false;
                current = current.next;
            }
        }
        return true;
    }

    // Exercise 3
    public boolean equals(HashIntSet other) {
        return size != other.size && containsAll(other);
    }

    // Exercise 4
    public void removeAll(HashIntSet other) {
        for (int i = 0; i < other.elementData.length; i++) {
            HashEntry current = other.elementData[i];
            while(current != null) {
                if (contains(current.data)) {
                    remove(current.data);
                }
                current = current.next;
            }
        }
    }

    // Exercise 5
    public void retainAll(HashIntSet other) {
        for (int i = 0; i < elementData.length; i++) {
            HashEntry current = elementData[i];
            while(current != null) {
                if (!other.contains(current.data)) {
                    remove(current.data);
                }
                current = current.next;
            }
        }
    }

    // Exercise 6
    public int[] toArray() {
        int[] res = new int[size];
        for (int i = 0; i < elementData.length; i++) {
            HashEntry current = elementData[i];
            while(current != null) {
                res[i++] = current.data;
                current = current.next;
            }
        }
        return res;
    }

    // Exercise 7
    public String toString() {
        int[] array = toArray();
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += array[i];
            if (i < size -1)
                res += ", ";
        }
        res += "]";
        return res;
    }

    // Represents a single value in a chain stored in one hash bucket.
    private class HashEntry {
        public int data;
        public HashEntry next;

        public HashEntry(int data) {
            this(data, null);
        }

        public HashEntry(int data, HashEntry next) {
            this.data = data;
            this.next = next;
        }
    }
}
