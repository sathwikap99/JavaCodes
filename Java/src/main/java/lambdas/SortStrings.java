package lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class SortStrings {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "grape", "watermelon"};

        // Using streams and lambdas to sort the array based on the given criteria
        Arrays.sort(strings, Comparator.comparing(String::length) // Sort based on length in ascending order
                .thenComparing(Comparator.comparing((String s) -> s.charAt(s.length() - 1)).reversed())); // Sort based on last character in descending order if lengths are equal

        // Print the sorted array
        System.out.println("Sorted array:");
        Arrays.stream(strings).forEach(System.out::println);
    }
}

