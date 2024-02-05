package functionalinterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedDigitsFinderTest {

    @Test
    void testFindRepeatedDigits() {
        assertEquals("2", RepeatedDigitsFinder.findRepeatedDigits(1223456789));
        assertEquals("3", RepeatedDigitsFinder.findRepeatedDigits(1233345678));
        assertEquals("", RepeatedDigitsFinder.findRepeatedDigits(123456789));
        assertEquals("", RepeatedDigitsFinder.findRepeatedDigits(123456789));
        assertEquals("", RepeatedDigitsFinder.findRepeatedDigits(1234567890));
    }

    @Test
    void testFindRepeatedDigitsWithNegativeNumber() {
        // Assuming negative numbers are not allowed in this case
        assertEquals("", RepeatedDigitsFinder.findRepeatedDigits(-123456789));
    }

    @Test
    void testFindRepeatedDigitsWithZero() {
        assertEquals("", RepeatedDigitsFinder.findRepeatedDigits(0));
    }
}
