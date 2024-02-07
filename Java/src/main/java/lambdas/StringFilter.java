package lambdas;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {
    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Banana", "Orange", "Grape", "Watermelon");

        // Filter strings starting with the letter "A"
        List<String> filteredStrings = filterStrings(strings, s -> s.startsWith("A"));

        // Print the filtered strings
        System.out.println("Filtered strings:");
        filteredStrings.forEach(System.out::println);
    }

    public static List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
        return strings.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}

