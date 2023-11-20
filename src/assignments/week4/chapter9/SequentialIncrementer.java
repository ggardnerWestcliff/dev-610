package assignments.week4.chapter9;

/*
--Exercise 18--
Declare an interface called Incrementable which represents items that store an integer that can be incremented in some
way. The interface has a method called increment that increments the value and a method called getValue that returns the
value. Once you have written the interface, write two classes called SequentialIncrementer and RandomIncrementer that
implement the interface. The SequentialIncrementer begins its value at 0 and increases it by 1 each time it is
incremented. The RandomIncrementer begins its value at a random integer and changes it to a new random integer each time
it is incremented.
 */

public class SequentialIncrementer implements Incrementable {
    private int value;
    public SequentialIncrementer() {
        value = 0;
    }

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
