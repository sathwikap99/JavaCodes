package functionalinterface;

import java.util.HashMap;
import java.util.Map;

public class RepeatedDigitsFinder {

    public static String findRepeatedDigits(int number) {
        // Convert the number to a string
        String numberStr = String.valueOf(number);

        // Use a HashMap to store the frequency of each digit
        Map<Character, Integer> digitFrequency = new HashMap<>();

        // Iterate through the characters of the string
        for (char digit : numberStr.toCharArray()) {
            // Update the frequency in the HashMap
            digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
        }

        // StringBuilder to store repeated digits
        StringBuilder repeatedDigits = new StringBuilder();

        // Iterate through the HashMap to find repeated digits
        for (Map.Entry<Character, Integer> entry : digitFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedDigits.append(entry.getKey());
            }
        }

        return repeatedDigits.toString();
    }
}

