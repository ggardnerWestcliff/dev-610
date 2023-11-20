package assignments.week4.chapter9;

public class RandomIncrementerMain {
    public static void main(String[] args) {
        RandomIncrementer ri = new RandomIncrementer();
        System.out.println(ri.getValue());
        ri.increment();
        System.out.println(ri.getValue());
    }
}
