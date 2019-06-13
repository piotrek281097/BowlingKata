import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

    @Test
    public void canScoreGutterGame() {
        Game game = new Game();
        for(int i = 0; i < 20; i++) {
            game.roll(0);
        }

        assertThat(game.score(), is(0));
    }
}
