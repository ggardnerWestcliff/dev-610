package assignments.week3.chapter6;

/*
--Exercise 6--

Write a method called readEntireFile that accepts a Scanner representing an input file as its parameter, then reads
that file and returns its entire text contents as a String.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseSix {
    public static final String FILE_PATH = "src/assignments/week3/chapter6/resources/";
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_PATH + "readEntireFile.txt"));
        System.out.println(readEntireFile(scanner));
    }

    public static String readEntireFile(Scanner input) {
        String fileString = "";
        while (input.hasNextLine()) {
            fileString += input.nextLine() + "\n";
        }
        return fileString;
    }
}
