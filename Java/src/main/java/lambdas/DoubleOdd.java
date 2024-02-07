package lambdas;

import java.util.Arrays;
import java.util.List;
public class DoubleOdd {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Filter out the even numbers and then double each remaining number using streams
            numbers.stream()
                    .filter(num -> num % 2 != 0) // Filter out the even numbers
                    .mapToInt(num -> num * 2)    // Double each remaining number
                    .forEach(System.out::println); // Print each doubled number
        }
    }


