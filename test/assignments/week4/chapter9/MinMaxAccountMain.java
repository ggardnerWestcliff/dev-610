package assignments.week4.chapter9;

public class MinMaxAccountMain {
    public static void main(String[] args) {
        MinMaxAccount account = new MinMaxAccount(new Startup(1000));
        account.debit(new Debit(100));
        System.out.println(account.getMin());
        System.out.println(account.getMax());

        account.credit(new Credit(200));
        System.out.println(account.getMin());
        System.out.println(account.getMax());
    }
}
