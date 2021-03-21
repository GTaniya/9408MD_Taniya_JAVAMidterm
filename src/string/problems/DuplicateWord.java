package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        st = st.toLowerCase();

        String[] word = st.split("\\s");
        Map<String, Integer> mp = new HashMap<String, Integer>();
        int count = 0;

        for (int i = 0; i < word.length; i++) {
            count = 1;

            for (int j = 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count++;

                    word[j] = "0";
                }
            }

              mp.put(word[i], count);
            if (count > 1 && word[i] != "0")
                System.out.println(mp);


        }

    }
}
