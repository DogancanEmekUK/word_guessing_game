package word_guessing_game;

import java.util.ArrayList;

public class Game {

    Integer attempts = 10;

    String word;

    String wordAfterAnswer;

    ArrayList<Character> guessedLetters = new ArrayList<>();

    public Game(WordChoser wc) {
        word = wc.getRandomWordFromDictionary();
    }

    public static void main(String[] args) {}

    public String getWordToGuess(Character letter) {

        guessedLetters.add(letter);

        StringBuilder sb = new StringBuilder(word);

        for (int i = 1; i < word.length(); i++) {
            if (guessedLetters.contains(word.toCharArray()[i])) {
                
            }
            else {
                if (word.toCharArray()[i] == letter) {
                    sb.setCharAt(i, letter);
                }
                else {
                    sb.setCharAt(i, '_');
                }
            }
        }

        return sb.toString();
    }

    public Integer getInitialAttempts() {
        return attempts;
    }
    
    public String guessLetter(Character letter) {
        
        letter.toString().toUpperCase();

        for (int i = 1; i < word.length(); i++) {
            if (word.toCharArray()[i] == letter) {
                return "Right!";
            }
        }
        return "Wrong!";
    }

    public Boolean gameIsWon() {
        if (!getWordToGuess(' ').contains("_")) {
            return true;
        }
        return false;
    }
}