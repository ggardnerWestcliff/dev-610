package assignments.week4.chapter9;


// Used for inheritance exercises.
public class BankAccount {
    public int balance;

    public BankAccount(Startup startup) {
        balance = startup.getInitialBalance();
    }

    public void debit(Debit debit) {
        balance -= debit.getAmount();
    }

    public void credit(Credit credit) {
        balance += credit.getAmount();
    }

    public int getBalance() {
        return this.balance;
    }

}
