package functionalinterface;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueWordCounterTest {

    @Test
    void countUniqueWords() {
        String inputString = "This is a test string. This string contains some test words.";

        Map<String, Integer> wordCountMap = UniqueWordCounter.countUniqueWords(inputString);

        assertEquals(8, wordCountMap.size());
        assertEquals(2, wordCountMap.get("this"));
        assertEquals(2, wordCountMap.get("test"));
        assertEquals(1, wordCountMap.get("is"));
        assertEquals(1, wordCountMap.get("a"));
        assertEquals(2, wordCountMap.get("string"));
        assertEquals(1, wordCountMap.get("contains"));
        assertEquals(1, wordCountMap.get("some"));
        assertEquals(1, wordCountMap.get("words"));
    }
}

