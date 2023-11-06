package assignments.week2.chapter3;

/*
--Exercise 13--

Write a method called pay that accepts two parameters: a real number for a TA’s salary,
and an integer for the number of hours the TA worked this week.

The method should return how much money to pay the TA. For example, the call pay(5.50, 6) should return 33.0.

The TA should receive “overtime” pay of 1.5 times the normal salary for any hours above 8.

For example, the call pay(4.00, 11) should return (4.00*8)+(6.00*3) or 50.0.

*/

public class ExerciseThirteen {
    public static void main(String[] args) {
        double salary = pay(4.00, 11);
        System.out.println(salary);
    }

    public static double pay(double salary, int hours){
        return (salary * Math.min(hours, 8)) + Math.max(salary * 1.5 * (hours - 8), 0);
    }
}
