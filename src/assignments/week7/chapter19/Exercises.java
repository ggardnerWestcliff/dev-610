package assignments.week7.chapter19;

/*
--Exercise 1--
Write a method printDoubled that uses stream operations to print twice the value of each element of array of integers.
For example, if the array passed is {2, -1, 4, 16}, print 4 -2 8 32.

--Exercise 2--
Write a method sumAbsVals that uses stream operations to compute the sum of the absolute values of an array of integers.
For example, the sum of {-1, 2, -4, 6, -9} is 22.

--Exercise 3--
Write a method largestEven that uses stream operations to find and return the largest even number from an array of
integers. For example, if the array is {5, -1, 12, 10, 2, 8}, your method should return 12. You may assume that the
array contains at least one even integer.

--Exercise 4--
Write a method totalCircleArea that uses stream operations to compute and return the sum of the areas of a group of
circles, rounded to the nearest whole number. Your function accepts an array of real numbers representing the radii of
the circles. For example, if the array is {3.0, 1.0, 7.2, 5.5}, return 289.0. Recall that the area of a circle of radius
r is pi*r^2.

--Exercise 5--
Write a method countNegatives that uses stream operations to count how many numbers in a given array of integers are
negative. For example, if the array is {5, -1, -3, 20, 47, -10, -8, -4, 0, -6, -6}, return 7.

--Exercise 6--
Write a method pigLatin that uses stream operations to convert a String parameter into its “Pig Latin” form. For this
problem we’ll use a simple definition of Pig Latin where the first letter should be moved to the end of the word and
followed by “ay.” For example, if the string passed is "go seattle mariners", return "o-gay eattle-say ariners-may".

--Exercise 7--
Write a method countVowels that uses stream operations to count the number of vowels in a given string. A vowel is an
A, E, I, O, or U, case-insensitive. For example, if the string is "SOO beautiful", there are seven vowels.

--Exercise 8--
Write a method toSortedForm that uses stream operations to convert a String parameter into a sorted form with its
letters in alphabetical order. For example, if the string passed is "tennessee", return "eeeennsst".

--Exercise 9--
Write a method stdev that computes the standard deviation of an array of real numbers. The formula for computing a
standard deviation d of N values is the following, where xi represents each ith element and avg represents the
arithmetic mean (average) of all the elements.

--Exercise 10--
Write a method glueReverse that accepts a List of strings as its parameter and uses stream operations to return a
single string consisting of the list’s elements concatenated together in reverse order. For example, if the list stores
["the", "quick", "brown", "fox"], you should return "foxbrownquickthe".

--Exercise 11--
Write a method theLines that accepts a file name as a parameter and uses stream operations to return a count of the
number of lines in the file that start with the word “The”, case-insensitive.

--Exercise 12--
Write a method fourLetterWords that accepts a file name as a parameter and returns a count of the number of unique
lines in the file that are exactly four letters long. Assume that each line in the file contains a single word.

--Exercise 13--
Write a method firstFive that accepts a file name string as its parameter and uses stream operations to print the first
five non-blank lines of the file. Do not use any loops or collections; perform the work entirely using streams.
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercises {
    public static final String FILE_PREFIX = "src/assignments/week7/chapter19/resources/";
    public static void main(String[] args) throws IOException {
        int[] array1 = {2, -1, 4, 16};
        printDoubled(array1);
        int[] array2 = {-1, 2, -4, 6, -9};
        System.out.println(sumAbsVals(array2));
        int[] array3 = {5, -1, 12, 10, 2, 8};
        System.out.println(largestEven(array3));
        double[] array4 = {3.0, 1.0, 7.2, 5.5};
        System.out.println(totalCircleArea(array4));
        int[] array5 = {5, -1, -3, 20, 47, -10, -8, -4, 0, -6, -6};
        System.out.println(countNegatives(array5));
        String string6 = "go seattle mariners";
        System.out.println(pigLatin(string6));
        String string7 = "SOO beautiful";
        System.out.println(countVowels(string7));
        String string8 = "tennessee";
        System.out.println(toSortedForm(string8));
        double[] array9 = {5.0, 2.0, 4.0, 3.0};
        System.out.println(stdev(array9));
        List<String> list10 = Arrays.asList("the", "quick", "brown", "fox");
        System.out.println(glueReverse(list10));
        String string11 = "theLines.txt";
        System.out.println(theLines(string11));
        String string12 = "fourLetterWords.txt";
        System.out.println(fourLetterWords(string12));
        String string13 = "firstFive.txt";
        firstFive(string13);
    }

    // Exercise 1
    public static void printDoubled(int[] array) {
        Arrays.stream(array).mapToObj(i -> i * 2 + " ").forEach(System.out::print);
        System.out.println();
    }

    // Exercise 2
    public static int sumAbsVals(int[] array) {
        return Arrays.stream(array).map(Math::abs).sum();
    }

    // Exercise 3
    public static int largestEven(int[] array) {
        return Arrays.stream(array).filter(i -> i % 2 == 0).max().getAsInt();
    }

    // Exercise 4
    public static double totalCircleArea(double[] array) {
        return Math.round(Arrays.stream(array).map(i -> Math.PI * i * i).sum());
    }

    // Exercise 5
    public static int countNegatives(int[] array) {
        return (int) Arrays.stream(array).filter(i -> i < 0).count();
    }

    // Exercise 6
    public static String pigLatin(String string) {
        return Arrays.stream(string.split(" "))
                .map(s -> s.substring(1) + "-" + s.charAt(0) + "ay")
                .collect(Collectors.joining(" "));
    }

    // Exercise 7
    public static int countVowels(String string) {
        return (int) Arrays.stream(string.toLowerCase().split("")).filter(s -> s.matches("[aeiou]")).count();
    }

    // Exercise 8
    public static String toSortedForm(String string) {
        return Arrays.stream(string.split("")).sorted().collect(Collectors.joining());
    }

    // Exercise 9
    public static double stdev(double[] array) {
        return Math.sqrt(
                Arrays.stream(array)
                        .map(i -> Math.pow(i - Arrays.stream(array).average().getAsDouble(), 2))
                        .sum() / array.length
        );
    }

    // Exercise 10
    public static String glueReverse(List<String> list) {
        return list.stream().reduce("", (a, b) -> b + a);
    }

    // Exercise 11
    public static int theLines(String fileName) throws IOException {
        return (int) Files.lines(Paths.get(FILE_PREFIX + fileName))
                .filter(s -> s.toLowerCase().startsWith("the"))
                .count();
    }

    // Exercise 12
    public static int fourLetterWords(String fileName) throws IOException {
        return (int) Files.lines(Paths.get(FILE_PREFIX + fileName))
                .filter(s -> s.length() == 4)
                .count();
    }

    // Exercise 13
    public static void firstFive(String fileName) throws IOException {
        Files.lines(Paths.get(FILE_PREFIX + fileName))
                .filter(s -> !s.isEmpty())
                .limit(5)
                .forEach(System.out::println);
    }
}
