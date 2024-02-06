package lambdas;

import java.util.Arrays;

public class StringsContainingVowels {
    public static void main(String[] args) {
        String[] inputStrings = {"apple", "banana", "cherry", "date", "elderberry"};

        // Using Streams and Lambdas to filter strings containing vowels
        // and then print each string along with the number of vowels
        Arrays.stream(inputStrings)
                .filter(s -> containsVowels(s))
                .forEach(s -> {
                    int vowelCount = countVowels(s);
                    System.out.println(s + " - Number of Vowels: " + vowelCount);
                });
    }

    private static boolean containsVowels(String str) {
        // Check if the string contains any vowels
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    private static int countVowels(String str) {
        // Count the number of vowels in the string
        return (int) str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
}

