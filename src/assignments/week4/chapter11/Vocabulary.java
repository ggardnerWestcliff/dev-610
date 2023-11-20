package assignments.week4.chapter11;

/*
--Exercise 20--
Write a modified version of the Vocabulary program developed in Chapter 10 that uses sets rather than ArrayLists to
store its words. (The program will be noticeably shorter and will run faster!)
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Vocabulary {
    public static final String FILE_PREFIX = "src/assignments/week4/chapter11/resources/";
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        giveIntro();

        System.out.print("file #1 name? ");
        Scanner input1 = new Scanner(new File(FILE_PREFIX + console.nextLine()));
        System.out.print("file #2 name? ");
        Scanner input2 = new Scanner(new File(FILE_PREFIX + console.nextLine()));
        System.out.println();

        Set<String> set1 = getWords(input1);
        Set<String> set2 = getWords(input2);
        Set<String> overlap = getOverlap(set1, set2);

        reportResults(set1, set2, overlap);
    }

    // post: reads all words from the given Scanner, turning them to lowercase
    //       and returning a sorted list of the vocabulary of the file
    public static Set<String> getWords(Scanner input) {
        // read all words and sort
        Set<String> words = new HashSet<>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            words.add(next);
        }
        return words;
    }

    // pre : list1 and list2 are sorted and contain no duplicates
    // post: constructs and returns an Set containing the words
    //       in common betweeen list1 and list2
    public static Set<String> getOverlap(Set<String> list1, Set<String> list2) {
        Set<String> result = new HashSet<>(list1);
        result.retainAll(list2);
        return result;
    }

    // post: explains program to user
    public static void giveIntro() {
        System.out.println("This program compares the vocabulary of two");
        System.out.println("text files, reporting the number of words");
        System.out.println("in common and the percent of overlap.");
        System.out.println();
    }

    // pre : overlap contains the words in commmon between list1 and list2
    // post: reports statistics about two word lists and their overlap
    public static void reportResults(Set<String> list1, Set<String> list2, Set<String> overlap) {
        System.out.println("file #1 words = " + list1.size());
        System.out.println("file #2 words = " + list2.size());
        System.out.println("common words  = " + overlap.size());

        double percent1 = 100.0 * overlap.size() / list1.size();
        double percent2 = 100.0 * overlap.size() / list2.size();
        System.out.println("% of file 1 in overlap = " + percent1);
        System.out.println("% of file 2 in overlap = " + percent2);
    }
}