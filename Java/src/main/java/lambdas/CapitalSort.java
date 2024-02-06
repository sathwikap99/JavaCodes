package lambdas;
import java.util.Arrays;

public class CapitalSort {
        public static void main(String[] args) {
            String[] inputStrings = {"apple", "banana", "cherry", "date", "elderberry"};

            // Using Streams and Lambdas to capitalize the first letter of each string
            // and then sorting the strings alphabetically
            Arrays.stream(inputStrings)
                    .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                    .sorted()
                    .forEach(System.out::println);
        }
    }


