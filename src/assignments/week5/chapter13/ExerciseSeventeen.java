package assignments.week5.chapter13;

/*
--Exercise 17--
Write a Comparator that compares String objects of a particular format. Each string is of a form such as
"123456 Seattle, WA", beginning with a numeric token that is followed by additional text tokens.
Your job is to treat the first tokens as integers and compare them in numerical order.
You cannot simply compare them by using the strings’ compareTo method, since it would treat the numbers as text and
not as integers. For example, "276453 Helena, MT" is greater than "9847 New York, NY".
Use a Scanner to tokenize the strings while comparing them.

*/

import java.util.Scanner;

public class ExerciseSeventeen {
    public class Address implements Comparable<Address> {
        private int numericToken;
        private String textToken;
        public Address(String address) {
            Scanner scanner = new Scanner(address);
            numericToken = scanner.nextInt();
            textToken = scanner.next();
        }

        public int compareTo(Address address) {
            if (numericToken < address.numericToken) {
                return -1;
            }
            if (numericToken > address.numericToken) {
                return 1;
            }
            return textToken.compareToIgnoreCase(address.textToken);
        }
    }
}
