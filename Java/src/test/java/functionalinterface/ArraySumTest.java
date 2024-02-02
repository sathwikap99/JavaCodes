package functionalinterface;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArraySumTest {

    @Test
    public void testCalculateSum() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, ArraySum.calculateSum(numbers));
    }
}

