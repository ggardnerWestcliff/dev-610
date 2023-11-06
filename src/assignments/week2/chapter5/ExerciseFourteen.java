package assignments.week2.chapter5;

/*
--Exercise 14--
Write a method called hasMidpoint that accepts three integers as parameters and returns true if one of the integers is
the midpoint between the other two integers; that is, if one integer is exactly halfway between them. Your method should
return false if no such midpoint relationship exists. For example, the call hasMidpoint(7, 4, 10) should return true
because 7 is halfway between 4 and 10. By contrast, the call hasMidpoint(9, 15, 8) should return false because no
integer is halfway between the other two. The integers could be passed in any order; the midpoint could be the 1st,
2nd, or 3rd. You must check all cases. If your method is passed three of the same value, return true.
*/

public class ExerciseFourteen {
    public static void main(String[] args) {
        System.out.println(hasMidpoint(7, 4, 10));
        System.out.println(hasMidpoint(9, 15, 8));
        System.out.println(hasMidpoint(7, 7, 7));
    }

    public static boolean hasMidpoint(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            return true;
        }
        int left = Math.min(a, Math.min(b, c));
        int right = Math.max(a, Math.max(b, c));
        if ((right - left) % 2 != 0) {
            return false;
        }
        int mid = (right - left) / 2;
        return (a == left + mid || b == left + mid || c == left + mid);
    }
}
