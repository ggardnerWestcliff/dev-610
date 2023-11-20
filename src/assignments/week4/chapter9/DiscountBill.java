package assignments.week4.chapter9;

/*
--Exercise 10--
DiscountBill. Suppose a class GroceryBill keeps track of a list of items being purchased at a market:

public GroceryBill(Employee clerk)	Constructs a grocery bill object for the given clerk
public void add(Item i)	            Adds the given item to this bill
public double getTotal()	        Returns the total cost of these items
public void printReceipt()	        Prints a list of items

Grocery bills interact with Item objects, each of which has the public methods that follow. A candy bar item might cost
1.35 with a discount of 0.25 for preferred customers, meaning that preferred customers get it for 1.10.
(Some items will have no discount, 0.0.) Currently the preceding classes do not consider discounts.
Every item in a bill is charged full price, and item discounts are ignored.

public double getPrice()	Returns the price for this item
public double getDiscount()	Returns the discount for this item

Define a class DiscountBill that extends GroceryBill to compute discounts for preferred customers. Its constructor
accepts a parameter for whether the customer should get the discount. Your class should also adjust the total reported
for preferred customers. For example, if the total would have been $80 but a preferred customer is getting $20 in
discounts, then getTotal should report the total as $60 for that customer. Also keep track of the number of items on
which a customer is getting a nonzero discount and the sum of these discounts, both as a total amount and as a
percentage of the original bill. Include the extra methods that follow, which allow a client to ask about the discount.
Return 0.0 if the customer is not a preferred customer or if no items were discounted.

public DiscountBill(Employee clerk, boolean preferred)	Constructs bill for given clerk
public int getDiscountCount()	                        Returns the number of items that were discounted, if any
public double getDiscountAmount()	                    Returns the total discount for this list of items, if any
public double getDiscountPercent()	                    Returns the percent of the total discount as a percent of what
                                                        the total would have been otherwise
*/

public class DiscountBill extends GroceryBill {
    private final boolean preferred;
    private int discountCount;
    private double discountAmount;

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
        discountCount = 0;
        discountAmount = 0.0;
    }

    public void addItem(Item i) {
        super.addItem(i);
        if (preferred) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }

    public int getDiscountCount() {
        return discountCount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getDiscountPercent() {
        return discountAmount / super.getTotal() * 100;
    }

    public double getTotal() {
        return super.getTotal() - discountAmount;
    }

    public void printReceipt() {
        for (int i = 0; i < items.length ; i++) {
            System.out.print(items[i]);
            if (preferred && items[i].getDiscount() > 0) {
                System.out.print("\t-$" + items[i].getDiscount());
            }
            System.out.println();
        }
    }
}
