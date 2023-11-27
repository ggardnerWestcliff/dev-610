package assignments.week5.chapter12;

/*
--Exercise 7--
Write a recursive method called writeChars that accepts an integer parameter n and that prints out a total of n
characters. The middle character of the output should always be an asterisk ("*"). If you are asked to write out an
even number of characters, then there will be two asterisks in the middle ("**"). Before the asterisk(s) you should
write out less-than characters ("<"). After the asterisk(s) you should write out greater-than characters (">").

Your method should throw an IllegalArgumentException if it is passed a value less than 1.

For example, the following calls produce the following output:

Method call	Output produced
writeChars(1);	*
writeChars(2);	**
writeChars(3);	<*>
writeChars(4);	<**>
writeChars(5);	<<*>>
writeChars(6);	<<**>>
writeChars(7);	<<<*>>>
writeChars(8);	<<<**>>>

*/

public class ExerciseSeven {
    public static void main(String[] args) {
        writeChars(1);
        System.out.println();
        writeChars(2);
        System.out.println();
        writeChars(3);
        System.out.println();
        writeChars(4);
        System.out.println();
        writeChars(5);
        System.out.println();
        writeChars(6);
        System.out.println();
        writeChars(7);
        System.out.println();
        writeChars(8);
        System.out.println();
    }

    public static void writeChars(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n cannot be less than 1");
        }
        if (n == 1) {
            System.out.print("*");
        } else if (n == 2) {
            System.out.print("**");
        } else {
            System.out.print("<");
            writeChars(n - 2);
            System.out.print(">");
        }
    }
}
