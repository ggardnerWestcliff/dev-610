package assignments.week4.chapter9;

/*
--Exercise 12--
FilteredAccount. A cash processing company has a class called Account used to process transactions:

public Account(Client c)	            Constructs an account using client information
public boolean process(Transaction t)	Processes the next transaction, returning true if the transaction was approved
                                        and false otherwise

Account objects interact with Transaction objects, which have many methods including

public int value()	Returns the value of this transaction in pennies (could be negative, positive or zero)

Design a new class called FilteredAccount whose instances can be used in place of normal accounts but which include the
extra behavior of not processing transactions with a value of 0. More specifically, the new class should indicate that
a zero-valued transaction was approved but shouldn’t call the process method for it. Your class should have a single
constructor that accepts a parameter of type Client, and it should include the following method:

public double percentFiltered()	Returns the percent of transactions filtered out (between 0.0 and 100.0);
                                returns 0.0 if no transactions are submitted
*/

public class FilteredAccount extends Account {
    private int transactionCount;
    private int zeroTransactionCount;
    public FilteredAccount(Client c) {
        super(c);
        zeroTransactionCount = 0;
    }

    public boolean process(Transaction t) {
        if (t.value() != 0) {
            transactionCount++;
            return super.process(t);
        } else {
            zeroTransactionCount++;
            return false;
        }
    }

    public double percentFiltered() {
        if (transactionCount == 0) {
            return 0.0;
        }
        return zeroTransactionCount * 100.0 / transactionCount;
    }
}
