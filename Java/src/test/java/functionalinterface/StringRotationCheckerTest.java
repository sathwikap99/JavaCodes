package functionalinterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRotationCheckerTest {

    @Test
    void testAreRotationsPositive() {
        assertTrue(StringRotationChecker.areRotations("abcd", "cdab"));
        assertTrue(StringRotationChecker.areRotations("hello", "lohel"));
        assertTrue(StringRotationChecker.areRotations("12345", "51234"));
    }

    @Test
    void testAreRotationsNegative() {
        assertFalse(StringRotationChecker.areRotations("abcd", "dcba"));
        assertFalse(StringRotationChecker.areRotations("hello", "world"));
        assertFalse(StringRotationChecker.areRotations("abc", "ab"));
        assertFalse(StringRotationChecker.areRotations("12345", "54321"));
    }

    @Test
    void testAreRotationsWithNull() {
        assertFalse(StringRotationChecker.areRotations(null, "abcd"));
        assertFalse(StringRotationChecker.areRotations("abcd", null));
        assertFalse(StringRotationChecker.areRotations(null, null));
    }

    @Test
    void testAreRotationsWithDifferentLength() {
        assertFalse(StringRotationChecker.areRotations("abcd", "abcde"));
        assertFalse(StringRotationChecker.areRotations("abcde", "abcd"));
    }
}
