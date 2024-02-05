package functionalinterface;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseArrayListTest {

    @Test
    void testReverseArrayList() {
        // Test with Integer ArrayList
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ReverseArrayList.reverseArrayList(intList);
        assertArrayEquals(new Integer[]{5, 4, 3, 2, 1}, intList.toArray());

        // Test with String ArrayList
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        ReverseArrayList.reverseArrayList(stringList);
        assertArrayEquals(new String[]{"cherry", "banana", "apple"}, stringList.toArray());

        // Test with an empty ArrayList
        ArrayList<Double> emptyList = new ArrayList<>();
        ReverseArrayList.reverseArrayList(emptyList);
        assertArrayEquals(new Double[]{}, emptyList.toArray());
    }
}

