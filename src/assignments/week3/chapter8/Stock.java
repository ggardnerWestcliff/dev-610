package assignments.week3.chapter8;


/*
--Exercise 10--
Add the following mutator method to the Stock class:

public void clear()

Resets this Stock’s number of shares purchased and total cost to 0.
*/

public class Stock {
    private String symbol;
    private int totalShares;
    private double totalCost;
    public Stock(String theSymbol) {
        if (theSymbol == null) {
            throw new NullPointerException();
        }
        symbol = theSymbol;
        totalShares = 0;
        totalCost = 0.0;
    }

    public double getProfit(double currentPrice) {
        if (currentPrice < 0.0) {
            throw new IllegalArgumentException();
        }
        double marketValue = totalShares * currentPrice;
        return marketValue - totalCost;
    }

    public void purchase(int shares, double pricePerShare) {
        if (shares < 0 || pricePerShare < 0.0) {
            throw new IllegalArgumentException();
        }
        totalShares += shares;
        totalCost += shares * pricePerShare;
    }

    public void clear() {
        totalShares = 0;
        totalCost = 0;
    }
}
