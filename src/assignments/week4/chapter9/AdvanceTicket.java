package assignments.week4.chapter9;

/*
--Exercise 7--
Implement a class called AdvanceTicket to represent tickets purchased in advance. An advance ticket is constructed with
a ticket number and with the number of days in advance that the ticket was purchased. Advance tickets purchased 10 or
more days before the event cost $30, and advance tickets purchased fewer than 10 days before the event cost $40.
*/

public class AdvanceTicket extends Ticket {
    private final int daysInAdvance;
    public AdvanceTicket(int number, int daysInAdvance) {
        super(number);
        this.daysInAdvance = daysInAdvance;
        super.setPrice();
    }

    public double determinePrice() {
        if (daysInAdvance >= 10) {
            return 30.0;
        }
        return 40.0;
    }
}
