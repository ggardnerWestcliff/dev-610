package assignments.week2.chapter4;

/*
--Exercise 12--

Write the method called printTriangleType referred to in Self-Check Problem 25.
This method accepts three integer arguments representing the lengths of the sides of a triangle and prints the type
of triangle that these sides form.

Here are some sample calls to printTriangleType:

printTriangleType(5, 7, 7);
printTriangleType(6, 6, 6);
printTriangleType(5, 7, 8);
printTriangleType(2, 18, 2);

The output produced by these calls should be

isosceles
equilateral
scalene
isosceles

Your method should throw an IllegalArgumentException if passed invalid values,
such as ones where one side’s length is longer than the sum of the other two, which is impossible in a triangle.
For example, the call of printTriangleType(2, 18, 2); should throw an exception.

*/

public class ExerciseTwelve {
    public static void main(String[] args) {
        printTriangleType(5, 7, 7);
        printTriangleType(6, 6, 6);
        printTriangleType(5, 7, 8);
        printTriangleType(2, 18, 2);
    }

    public static void printTriangleType(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("Invalid triangle: side length cannot be less than 0.");
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalArgumentException(
                "Invalid triangle: side length cannot be greater than the sum of the other two sides."
            );
        } else if (side1 == side2 && side2 == side3) {
            System.out.println("equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}
