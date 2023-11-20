package assignments.week4.chapter9;

/*
--Exercise 12--
Add an equals method to the TimeSpan class introduced in Chapter 8.
Two time spans are considered equal if they represent the same number of hours and minutes.
*/

public class TimeSpanMain {
    public static void main(String[] args) {
        TimeSpan timeSpan = new TimeSpan(1, 30);
        TimeSpan timeSpan2 = new TimeSpan(1, 30);
        System.out.println(timeSpan.equals(timeSpan2));

        System.out.println(timeSpan.equals("this is a string"));
    }
}
