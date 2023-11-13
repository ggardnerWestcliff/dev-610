package assignments.week3.chapter6;

/*
--Exercise 12--

Write a method called stripHtmlTags that accepts a Scanner representing an input file containing an HTML web page as
its parameter, then reads that file and prints the file’s text with all HTML tags removed.
A tag is any text between the characters < and >.

For example, consider the following text:

<html>
<head>
<title>My web page</title>
</head>
<body>
<p>There are many pictures of my cat here,
as well as my <b>very cool</b> blog page,
which contains <font color="red">awesome
stuff about my trip to Vegas.</p>

Here’s my cat now:<img src="cat.jpg">
</body>
</html>


If the file contained these lines, your program should output the following text:

My web page

There are many pictures of my cat here,
as well as my very cool blog page,
which contains awesome
stuff about my trip to Vegas.

Here’s my cat now:

You may assume that the file is a well-formed HTML document and that there are no < or > characters inside tags.

*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseTwelve {
    public static final String FILE_PREFIX = "src/assignments/week3/chapter6/resources/";
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_PREFIX + "stripHtmlTags.html"));
        stripHtmlTags(scanner);
    }

    public static void stripHtmlTags(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();

            while (line.contains("<")) {
                int start = line.indexOf("<");
                int end = line.indexOf(">");
                line = line.substring(0, start) + line.substring(end + 1);
            }
            System.out.println(line);
        }
    }
}
