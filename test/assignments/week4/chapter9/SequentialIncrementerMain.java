package assignments.week4.chapter9;

public class SequentialIncrementerMain {
    public static void main(String[] args) {
        SequentialIncrementer si = new SequentialIncrementer();
        System.out.println(si.getValue());
        si.increment();
        System.out.println(si.getValue());
    }
}
