package assignments.week3.chapter8;

/*
--Exercise 11--
Add a field to the BankAccount class named transactionFee for a real number representing an amount of money to deduct
every time the user withdraws money. The default value is $0.00, but the client can change the value. Deduct the
transaction fee money during every withdraw call (but not from deposits). Make sure that the balance cannot go negative
during a withdrawal. If the withdrawal (amount plus transaction fee) would cause it to become negative, don’t modify the
balance at all.


--Exercise 12--
Add a toString method to the BankAccount class from the previous exercise. Your method should return a string that
contains the account’s name and balance separated by a comma and space. For example, if an account object named yana
has the name "Yana" and a balance of 3.03, the call yana.toString() should return the string "Yana, $3.03".


--Exercise 13--
Add a transfer method to the BankAccount class from the previous exercises. Your method should move money from the
current bank account to another account. The method accepts two parameters: a second BankAccount to accept the money,
and a real number for the amount of money to transfer. There is a $5.00 fee for transferring money, so this much must be
deducted from the current account’s balance before any transfer. The method should modify the two BankAccount objects
such that “this” current object has its balance decreased by the given amount plus the $5 fee, and the other account’s
balance is increased by the given amount. If this account object does not have enough money to make the full transfer,
transfer whatever money is left after the $5 fee is deducted. If this account has under $5 or the amount is 0 or less,
no transfer should occur and neither account’s state should be modified.

*/

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 0.0;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        double withdrawalAmount = amount + transactionFee;
        if (withdrawalAmount > balance) {
            return;
        }
        balance = balance - withdrawalAmount;
    }

    public String toString() {
        return name + ", $" + balance;
    }

    public void transfer(BankAccount other, double amount) {
        if (balance <= 5.0 || amount <= 0) {
            // Cannot withdraw or transfer.
            return;
        }
        if (amount + 5.00 > balance) {
            // Can only transfer remainder of balance - transfer fee.
            amount = Math.max(0, balance - 5.00);
        }
        other.deposit(amount);
        balance -= amount + 5.00;
    }
}