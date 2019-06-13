import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private Game game;

    @Before
    public void setup() {
        game = new Game();
    }

    @Test
    public void canScoreGutterGame() {
        roll(20, 0);

        assertThat(game.score(), is(0));
    }

    @Test
    public void canScoreGameOfOnes() {
        roll(20, 1);

        assertThat(game.score(), is(20));
    }

    private void roll(int times, int pinsDown) {
        for (int i = 0; i < times; i++) {
            game.roll(pinsDown);
        }
    }

}
