package assignments.week2.chapter4;

/*
--Exercise 10--

Write a method called printGPA that accepts a Scanner for the console as a parameter and calculates a student’s grade
point average. The user will type a line of input containing the student’s name,
then a number that represents the number of scores, followed by that many integer scores.

Here are two example dialogues:

Enter a student record: Maria 5 72 91 84 89 78
Maria's grade is 82.8

Enter a student record: Jordan 4 86 71 62 90
Jordan's grade is 77.25
*/

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printGPA(scanner);
    }

    public static void printGPA(Scanner scanner) {
        System.out.print("Enter a student record: ");
        String name = scanner.next();
        int scoreCount = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= scoreCount; i++) {
            sum += scanner.nextInt();
        }
        double gpa = sum / (double) scoreCount;
        System.out.println(name + "'s grade is " + gpa);
    }
}
