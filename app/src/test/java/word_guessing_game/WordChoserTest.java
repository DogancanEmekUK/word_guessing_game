package word_guessing_game;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class WordChoserTest {
    @Test public void testGetsRandomWordFromDictionary() {
        WordChoser wc = new WordChoser();
        String[] MOCK_DICT = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
        assertTrue(Arrays.asList(MOCK_DICT).contains(wc.getRandomWordFromDictionary()));
    }
}
