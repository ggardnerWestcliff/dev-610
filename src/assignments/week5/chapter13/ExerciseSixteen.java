package assignments.week5.chapter13;

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseSixteen {
    public class String implements Comparable<String> {
        private ArrayList<java.lang.String> words;
        public String(java.lang.String string) {
            this.words = new ArrayList<>(Arrays.asList(string.split(" ")));
        }

        public ArrayList<java.lang.String> getWords() {
            return words;
        }

        public void setWords(ArrayList<java.lang.String> words) {
            this.words = words;
        }

        public int compareTo(String o) {
            return Integer.compare(this.words.size(), o.words.size());
        }
    }
}
