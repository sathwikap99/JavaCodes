package lambdas;
import java.util.Arrays;
public class AvgofSquares {
        public static void main(String[] args) {
            Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            // Using streams and lambdas to filter odd numbers, calculate squares, and then find the average
            double averageOfOddSquares = Arrays.stream(numbers)
                    .filter(num -> num % 2 != 0) // Filter odd numbers
                    .mapToDouble(num -> num * num) // Calculate squares
                    .average() // Calculate average
                    .orElse(0); // Default value if no elements are present

            System.out.println("Average of squares of odd numbers: " + averageOfOddSquares);
        }
    }


