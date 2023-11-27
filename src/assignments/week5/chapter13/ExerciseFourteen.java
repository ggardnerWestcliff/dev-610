package assignments.week5.chapter13;

/*
--Exercise 14--
Write code to read a dictionary from a file, then prompt the user for two words and tell the user how many words in the
dictionary fall between those two words. Here is a sample run of the program:


Type two words: goodbye hello
There are 4418 words between goodbye and hello
Use the binary search algorithm in your solution.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseFourteen {
    public static final String FILE_PREFIX = "src/assignments/week5/chapter13/resources/";
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = readDictionary();
        System.out.print("Type two words: ");
        String first = scanner.next();
        String second = scanner.next();
        int firstIndex = binarySearch(words, first);
        int secondIndex = binarySearch(words, second);
        int diff = Math.abs(secondIndex - firstIndex);
        System.out.println("There are " + diff + " words between " + first + " and " + second);
    }

    public static ArrayList<String> readDictionary() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File(FILE_PREFIX + "words.txt"));
        ArrayList<String> words = new ArrayList<>();
        while (fileScanner.hasNext()) {
            words.add(fileScanner.next());
        }
        return words;
    }

    public static int binarySearch(ArrayList<String> strings, String target) {
        int min = 0;
        int max = strings.size() - 1;
        while (min <= max) {
            int mid = (max + min) / 2;
            int compare = strings.get(mid).compareToIgnoreCase(target);
            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}
