package assignments.week3.chapter6;

/*
--Exercise 13--

Write a method called stripComments that accepts a Scanner representing an input file containing a Java program as its
parameter, reads that file, and then prints the file’s text with all comments removed.

A comment is any text on a line from // to the end of the line, and any text between `/ *` and `* /` characters.

For example, consider the following text:

```
import java.util.*;

/ * My program
by Suzy Student * /
public class Program {
    public static void main(String[] args) {
        System.out.println("Hello, world!"); // a println
    }
    public static / * Hello there * / void foo() {
        System.out.println("Goodbye!"); // comment here
    } / * * /
}
```
    If the file contained this text, your program should output the following text:

```
import java.util.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
    public static  void foo() {
        System.out.println("Goodbye!");
    }
}
```
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseThirteen {

    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(FILE_PREFIX + "stripComments.txt"));
        stripComments(input);
    }

    public static void stripComments(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.startsWith("/*") || (!line.contains("/*") && line.endsWith("*/"))) {
                continue;
            }
            while (line.contains("//") || line.contains("/*") || line.contains("*/")) {
                if (line.contains("/*") && line.contains("*/")) {
                    line = line.substring(0, line.indexOf("/*") - 1) + line.substring(line.indexOf("*/") + 2);
                }
                if (line.contains("//")) {
                    line = line.substring(0, line.indexOf("//"));
                }
            }
            System.out.println(line);
        }
    }
}
