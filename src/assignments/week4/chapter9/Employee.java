package assignments.week4.chapter9;

// A class to represent employees in general.
// Setup for general inheritance exercises.
public class Employee {

    public int getHours() {
        return 40;
    }

    public int getVacationDays() {
        return 10;
    }

    public double getSalary() {
        return 40000.0;
    }

    public String getVacationForm() {
        return "yellow";
    }

    public void applyForVacation() {
        System.out.println("Use the " + getVacationForm() + " vacation form.");
    }

    public void showHours() {
        System.out.println("I work " + getHours() + " hours per week.");
    }

    public void showSalary() {
        System.out.println("My salary is $" + getSalary() + ".");
    }

    public void showVacation() {
        System.out.println("I receive " +getVacationDays() + " days vacation.");
    }
}
