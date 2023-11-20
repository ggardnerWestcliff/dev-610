package assignments.week4.chapter9;

/*
--Exercise 5--
For the next four problems, consider the task of representing types of tickets to campus events. Each ticket has a
unique number and a price. There are three types of tickets: walk-up tickets, advance tickets, and student advance
tickets.

Walk-up tickets are purchased the day of the event and cost $50.
Advance tickets purchased 10 or more days before the event cost $30, and advance tickets purchased fewer than 10 days
before the event cost $40.
Student advance tickets are sold at half the price of normal advance tickets: When they are purchased 10 or more days
early they cost $15, and when they are purchased fewer than 10 days early they cost $20.

Implement a class called Ticket that will serve as the superclass for all three types of tickets. Define all common
operations in this class, and specify all differing operations in such a way that every subclass must implement them.
No actual objects of type Ticket will be created: Each actual ticket will be an object of a subclass type.

Define the following operations:
The ability to construct a ticket by number.
The ability to ask for a ticket’s price.
The ability to println a ticket object as a String. An example String would be "Number: 17, Price: 50.0".
*/

public abstract class Ticket {
    private final int number;
    private double price;

    public Ticket(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void setPrice() {
        this.price = determinePrice();
    }

    public abstract double determinePrice();

    public void showPrice() {
        System.out.println("The ticket costs $" + getPrice() + ".");
    }

    public String toString() {
        return "Number: " + getNumber() + ", Price: " + getPrice();
    }
}
