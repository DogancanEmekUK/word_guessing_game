package word_guessing_game;

import java.util.Random;
import java.lang.reflect.Array;

public class WordChoser {

    static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
    public static void main(String[] args) {}

    public String getRandomWordFromDictionary() {
        Random r = new Random();
        Integer randomNumber = r.nextInt(Array.getLength(DICTIONARY));
        return DICTIONARY[randomNumber];
    }
}
