package lambdas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class CapitalSortTest {

        @Test
        public void test1() {
            // Test case 1: Basic test with different strings
            String[] input1 = {"apple", "banana", "orange", "kiwi"};
            String[] expectedOutput1 = {"Apple", "Banana", "Kiwi", "Orange"};
            assertArrayEquals(expectedOutput1, CapitalSort.capitalizeAndSort(input1));
        }

        @Test
        public void test2() {
            // Test case 2: Test with empty array
            String[] input2 = {};
            String[] expectedOutput2 = {};
            assertArrayEquals(expectedOutput2, CapitalSort.capitalizeAndSort(input2));
        }

        @Test
        public void test3() {
            // Test case 3: Test with already capitalized strings
            String[] input3 = {"Apple", "Banana", "kiwi", "Orange"};
            String[] expectedOutput3 = {"Apple", "Banana", "Kiwi", "Orange"};
            assertArrayEquals(expectedOutput3, CapitalSort.capitalizeAndSort(input3));
        }

        @Test
        public void test4() {
            // Test case 4: Test with strings containing spaces
            String[] input4 = {"apple pie", "banana split", "kiwi smoothie"};
            String[] expectedOutput4 = {"Apple pie", "Banana split", "Kiwi smoothie"};
            assertArrayEquals(expectedOutput4, CapitalSort.capitalizeAndSort(input4));
        }

        @Test
        public void test5() {
            // Test case 3: Test with mixed cases in each element
            String[] input5 = {"apPle", "BAnAna", "kIwI", "oRaNge","avoCADO"};
            String[] expectedOutput5 = {"Apple", "Avocado", "Banana", "Kiwi", "Orange"};
            assertArrayEquals(expectedOutput5, CapitalSort.capitalizeAndSort(input5));
        }
    }

