import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class GameTest {

    @Test
    void shouldReturnLoveIsScoreIs0() {
        Game g = new Game(new Player(0), new Player(0));
        Assertions.assertEquals("love-love", g.describeGame());
    }

    @Test
    void shouldReturnFifteenIsScoreIs0() {
        Game g = new Game(new Player(1), new Player(0));
        Assertions.assertEquals("fifteen-love", g.describeGame());
    }

    @Test
    void shouldReturnThirtyIsScoreIs2() {
        Game g = new Game(new Player(1), new Player(2));
        Assertions.assertEquals("fifteen-thirty", g.describeGame());
    }

    @Test
    void shouldReturnFortyIsScoreIs2() {
        Game g = new Game(new Player(3), new Player(2));
        Assertions.assertEquals("forty-thirty", g.describeGame());
    }

}