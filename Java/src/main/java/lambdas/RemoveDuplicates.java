package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class RemoveDuplicates {


        public static void main(String[] args) {
            List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 1, 3);

            // Remove duplicates using streams
            List<Integer> distinctNumbers = numbersWithDuplicates.stream()
                    .distinct()
                    .collect(Collectors.toList());

            // Print the list without duplicates
            System.out.println("List without duplicates: " + distinctNumbers);
        }
    }


