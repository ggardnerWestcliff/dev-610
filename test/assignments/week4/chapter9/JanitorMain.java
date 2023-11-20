package assignments.week4.chapter9;

/*
--Exercise 2--
Write a class Janitor to accompany the other law firm classes described in this chapter. Janitors work twice as many
hours per week as other employees (80 hours/week), they make $30,000 ($10,000 less than general employees), they get
half as much vacation as other employees (only 5 days), and they have an additional method clean that prints "Workin'
for the man." Make sure to interact with the superclass as appropriate.
*/

public class JanitorMain {
    public static void main(String[] args) {
        Janitor janitor = new Janitor();
        janitor.showHours();
        janitor.showSalary();
        janitor.showVacation();
        janitor.clean();
    }
}
