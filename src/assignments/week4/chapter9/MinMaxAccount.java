package assignments.week4.chapter9;

/*
--Exercise 9--
MinMaxAccount. A company has written a large class BankAccount with many methods including:

public BankAccount(Startup s)   Constructs a BankAccount object using information in s
public void debit(Debit d)	    Records the given debit
public void credit(Credit c)	Records the given credit
public int getBalance()	        Returns the current balance in pennies

Design a new class MinMaxAccount whose instances can be used in place of a bank account but include new behavior of
remembering the minimum and maximum balances ever recorded for the account. The class should have a constructor that
accepts a Startup parameter. The bank account’s constructor sets the initial balance on the basis of the startup
information. Assume that only debits and credits change an account’s balance.

Include these new methods in your class:

public int getMin()	Returns the minimum balance in pennies
public int getMax()	Returns the maximum balance in pennies
*/

public class MinMaxAccount extends BankAccount {
    private int min;
    private int max;
    public MinMaxAccount(Startup startup) {
        super(startup);
        min = getBalance();
        max = getBalance();
    }

    public void debit(Debit debit) {
        super.debit(debit);
        update();
    }

    public void credit(Credit credit) {
        super.credit(credit);
        update();
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    private void update() {
        int balance = getBalance();
        if (balance < min) {
            min = balance;
        } else if (balance > max) {
            max = balance;
        }
    }
}
