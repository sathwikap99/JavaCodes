package functionalinterface;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
public class PalindromeTest {

        @Test
        public void testIsPalindromeWithPalindrome() {
            assertTrue(Palindrome.isPalindrome(121));
        }

        @Test
        public void testIsPalindromeWithNonPalindrome() {
            assertFalse(Palindrome.isPalindrome(123));
        }

        @Test
        public void testIsPalindromeWithSingleDigit() {
            assertTrue(Palindrome.isPalindrome(7));
        }

        @Test
        public void testIsPalindromeWithNegativeNumber() {
            assertFalse(Palindrome.isPalindrome(-121));
        }
    }

