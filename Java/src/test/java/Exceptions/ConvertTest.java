package Exceptions;

import exceptions.Convert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConvertTest {



        @Test
        public void testConvertToIntValidInput() {
            assertEquals(23, Convert.convertToInt("23"));
        }

        @Test
        public void testConvertToIntInvalidInput() {
            assertThrows(NumberFormatException.class, () -> Convert.convertToInt("45.67"));
        }

        @Test
        public void testConvertToIntNonNumericInput() {
            assertThrows(NumberFormatException.class, () -> Convert.convertToInt("test"));
        }

        @Test
        public void testConvertToIntNumericWithNonDigits() {
            assertThrows(NumberFormatException.class, () -> Convert.convertToInt("123f"));
        }
    }


