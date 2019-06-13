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
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);

        assertThat(game.score(), is(0));
    }

    @Test
    public void canScoreGameOfOnes() {
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);

        assertThat(game.score(), is(20));
    }

    @Test
    public void canScoreSpareFollowedByThree() {
        game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);

        assertThat(game.score(), is(16));
    }



}
