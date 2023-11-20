package assignments.week4.chapter9;


// Used for inheritance exercises.
public class Item {
    private final String name;
    private final double price;
    private final double discount;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.discount = 0.0;
    }

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + "\t\t$" + price;
    }
}
