package assignments.week4.chapter10;

public class TimeSpanMain {
    public static void main(String[] args) {
		TimeSpan timeSpan1 = new TimeSpan(3, 15);
        TimeSpan timeSpan2 = new TimeSpan(1, 40);
        TimeSpan timeSpan3 = new TimeSpan(1, 40);
        System.out.println(timeSpan1.compareTo(timeSpan2));
        System.out.println(timeSpan2.compareTo(timeSpan1));
        System.out.println(timeSpan2.compareTo(timeSpan3));
	}
}
