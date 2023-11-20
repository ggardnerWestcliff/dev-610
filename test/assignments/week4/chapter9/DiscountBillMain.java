package assignments.week4.chapter9;

public class DiscountBillMain {
    public static void main(String[] args) {
        Item apple = new Item("Apple", 1.49);
        Item orange = new Item("Orange", 2.56, 0.1);
        Item banana = new Item("Banana", 1.18, 1.0);
        DiscountBill bill = new DiscountBill(new Employee(), true);
        bill.addItem(apple);
        bill.printReceipt();
        System.out.println(bill.getDiscountAmount());
        System.out.println(bill.getDiscountPercent());
        bill.addItem(orange);
        bill.printReceipt();
        System.out.println(bill.getDiscountAmount());
        System.out.println(bill.getDiscountPercent());
        bill.addItem(banana);
        bill.printReceipt();
        System.out.println(bill.getDiscountAmount());
        System.out.println(bill.getDiscountPercent());

        DiscountBill nonPreferredBill = new DiscountBill(new Employee(), false);
        nonPreferredBill.addItem(apple);
        nonPreferredBill.printReceipt();
        System.out.println(nonPreferredBill.getDiscountAmount());
        System.out.println(nonPreferredBill.getDiscountPercent());
        nonPreferredBill.addItem(orange);
        nonPreferredBill.printReceipt();
        System.out.println(nonPreferredBill.getDiscountAmount());
        System.out.println(nonPreferredBill.getDiscountPercent());
        nonPreferredBill.addItem(banana);
        nonPreferredBill.printReceipt();
        System.out.println(nonPreferredBill.getDiscountAmount());
        System.out.println(nonPreferredBill.getDiscountPercent());
    }
}
