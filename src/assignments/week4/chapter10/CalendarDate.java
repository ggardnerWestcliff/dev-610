package assignments.week4.chapter10;

/*
--Exercise 21--
Modify the CalendarDate class from this chapter to include a year field, and modify its compareTo method to take years
into account when making comparisons. Years take precedence over months, which take precedence over days.
For example, July 18, 1995, comes before March 2, 2001.
*/

public class CalendarDate implements Comparable<CalendarDate> {
    private int year;
    private int month;
    private int day;

    public CalendarDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Compares this calendar date to another date.
    // Dates are compared by year, then by month and then by day.
    public int compareTo(CalendarDate other) {
        if (this.year != other.year) {
            return this.year - other.year;
        }
        if (this.month != other.month) {
            return this.month - other.month;
        }
        return this.day - other.day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }
}

