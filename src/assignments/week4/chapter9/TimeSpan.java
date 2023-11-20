package assignments.week4.chapter9;

/*
--Exercise 12--
Add an equals method to the TimeSpan class introduced in Chapter 8.
Two time spans are considered equal if they represent the same number of hours and minutes.
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
        totalMinutes += span.getTotalMinutes();
    }

    public void subtract(TimeSpan span) {
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
        if (obj instanceof TimeSpan) {
            TimeSpan span = (TimeSpan) obj;
            return span.getTotalMinutes() == totalMinutes;
        }
        return false;
    }
}
