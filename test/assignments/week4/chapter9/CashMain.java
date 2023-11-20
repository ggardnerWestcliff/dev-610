package assignments.week4.chapter9;

/*
--Exercise 13--
Add an equals method to the Cash class introduced in this chapter.
Two cash objects are considered equal if they represent the same amount of money.
*/

public class CashMain {
    public static void main(String[] args) {
        Cash cash1 = new Cash(100);
        Cash cash2 = new Cash(100);
        Cash cash3 = new Cash(200);

        System.out.println(cash1.equals(cash2));
        System.out.println(cash1.equals(cash3));
    }
}
