package assignments.week4.chapter10;

public class CalendarDateMain {
    public static void main(String[] args) {
        CalendarDate calendarDate1 = new CalendarDate(2020, 10, 10);
        CalendarDate calendarDate2 = new CalendarDate(2021, 10, 10);
        CalendarDate calendarDate3 = new CalendarDate(2020, 10, 15);
        CalendarDate calendarDate4 = new CalendarDate(2020, 10, 15);
        System.out.println(calendarDate1.compareTo(calendarDate2));
        System.out.println(calendarDate3.compareTo(calendarDate1));
        System.out.println(calendarDate4.compareTo(calendarDate3));
    }
}
