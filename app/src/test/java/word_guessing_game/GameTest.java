package word_guessing_game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

    Game game = new Game(mockedChoser);

    assertEquals(game.getWordToGuess('a'), "D________");
  }
  @Test public void testGetsInitialRemainingAttempts() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
    Game game = new Game(mockedChoser);
    Integer attemptsNumber = 10;
    assertEquals(game.getInitialAttempts(), Integer.valueOf(attemptsNumber));
  }
  @Test public void testReturnsWinner() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("LONDON");
    Game game = new Game(mockedChoser);
    game.getWordToGuess('L');
    game.getWordToGuess('O');
    game.getWordToGuess('N');
    game.getWordToGuess('D');
    assertEquals(game.gameIsWon(), true);
  }
}
