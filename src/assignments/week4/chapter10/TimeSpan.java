package assignments.week4.chapter10;

/*
--Exercise 20--
Modify the TimeSpan class from Chapter 8 to include a compareTo method that compares time spans by their length.
A time span that represents a shorter amount of time is considered to be “less than” one that represents a longer
amount of time. For example, a span of 3 hours and 15 minutes is greater than a span of 1 hour and 40 minutes.
*/

public class TimeSpan implements Comparable<TimeSpan> {
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

    public void add(assignments.week4.chapter9.TimeSpan span) {
        totalMinutes += span.getTotalMinutes();
    }

    public void subtract(assignments.week4.chapter9.TimeSpan span) {
        totalMinutes -= span.getTotalMinutes();
    }

    public void scale(int factor) {
        totalMinutes *= factor;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public String toString() {
        return (totalMinutes / 60) + "h " + (totalMinutes % 60) + "m";
    }

    public boolean equals(Object obj) {
        if (obj instanceof assignments.week4.chapter9.TimeSpan) {
            assignments.week4.chapter9.TimeSpan span = (assignments.week4.chapter9.TimeSpan) obj;
            return span.getTotalMinutes() == totalMinutes;
        }
        return false;
    }

    public int compareTo(TimeSpan o) {
        return Integer.compare(totalMinutes, o.getTotalMinutes());
    }
}

