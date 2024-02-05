package functionalinterface;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    public static Map<String, Integer> countUniqueWords(String input) {
        // Remove punctuation and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words
        String[] words = cleanedInput.split("\\s+");

        // Count the frequency of each word using a HashMap
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}

