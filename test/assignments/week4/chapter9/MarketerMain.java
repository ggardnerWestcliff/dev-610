package assignments.week4.chapter9;

/*
--Exercise 1--
Write the class Marketer to accompany the other law firm classes described in this chapter. Marketers make $50,000
($10,000 more than general employees) and have an additional method called advertise that prints "Act now, while
supplies last!" Make sure to interact with the superclass as appropriate.
*/

public class MarketerMain {
    public static void main(String[] args) {
        Marketer marketer = new Marketer();
        marketer.showSalary();
        marketer.advertise();
    }
}
