package assignments.week4.chapter9;

public class Account {
    private int balance;
    private final Client client;
    public Account(Client c) {
        balance = 0;
        this.client = c;
    }

    public boolean process(Transaction t) {
        if (balance + t.value() >= 0) {
            updateBalance(t);
            return true;
        }
        return false;
    }

    private void updateBalance(Transaction t) {
        balance += t.value();
    }

    public int getBalance() {
        return balance;
    }

    public String toString() {
        return "Client: " + client.getName() + "\tBalance: " + getBalance();
    }
}
