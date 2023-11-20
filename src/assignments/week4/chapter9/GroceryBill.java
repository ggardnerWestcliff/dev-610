package assignments.week4.chapter9;

public class GroceryBill {
    double total;
    Item[] items;

    public GroceryBill(Employee clerk) {
        this.items = new Item[0];
    }

    public void addItem(Item i) {
        // This would be done using an ArrayList but they are covered in the next chapter.
        Item[] temp = new Item[items.length + 1];
        for (int j = 0; j < items.length; j++) {
            temp[j] = items[j];
        }
        temp[items.length] = i;
        items = temp;
        total += i.getPrice();
    }

    public double getTotal() {
        return total;
    }

    public void printReceipt() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}
