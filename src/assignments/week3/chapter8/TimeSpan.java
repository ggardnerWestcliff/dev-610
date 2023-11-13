package assignments.week3.chapter8;

/*
--Exercise 7--
Add the following mutator method to the TimeSpan class:

public void add(TimeSpan span)

Adds the given amount of time to this time span.


--Exercise 8--
Add the following mutator method to the TimeSpan class:

public void subtract(TimeSpan span)

Subtracts the given amount of time from this time span.


--Exercise 9--
Add the following mutator method to the TimeSpan class:

public void scale(int factor)

Scales this time span by the given factor.
For example, 1 hour and 45 minutes scaled by 2 equals 3 hours and 30 minutes.
*/

public class TimeSpan {
    private int totalMinutes;

    public TimeSpan(int hours, int minutes) {
        totalMinutes = 0;
        add(hours, minutes);
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }
        totalMinutes += 60 * hours + minutes;
    }

    public void add(TimeSpan span) {
        totalMinutes += span.totalMinutes;
    }

    public void subtract(TimeSpan span) {
        totalMinutes -= span.totalMinutes;
    }

    public void scale(int factor) {
        totalMinutes *= factor;
    }

    public String toString() {
        return (totalMinutes / 60) + "h " + (totalMinutes % 60) + "m";
    }
}
