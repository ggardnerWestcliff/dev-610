package assignments.week5.chapter12;

/*
--Exercise 13--
Write a recursive method called indexOf that accepts two strings as parameters and that returns the starting index of
the first occurrence of the second string inside the first string (or −1 if not found).

For example, the call of indexOf("Barack Obama", "bam") would return 8. (Strings already have an indexOf method,
but you may not call it in your solution.)
*/

public class ExerciseThirteen {
    public static void main(String[] args) {
        System.out.println(indexOf("Barack Obama", "bam"));
        System.out.println(indexOf("Barack Obama", "foo"));
    }

    public static int indexOf(String s1, String s2) {
        if (s1.length() == s2.length()) {
            if (s1.equals(s2)) {
                return 0;
            }
        } else if (s1.length() >= s2.length()) {
            if (s1.startsWith(s2)) {
                return 0;
            } else {
                int index = 1 + indexOf(s1.substring(1), s2);
                if (index != 0) {
                    return index;
                }
            }
        }
        return -1;
    }
}
