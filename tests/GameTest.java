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

    @Test
    void shouldReturnAdvantageIfOneMorePointAfter3Points() {
        Game g = new Game(new Player(4), new Player(3));
        Assertions.assertEquals("advantage-forty", g.describeGame());
    }

    @Test
    void shouldReturnAdvantageIfPlayer2OneMorePointAfter3Points() {
        Game g = new Game(new Player(3), new Player(4));
        Assertions.assertEquals("forty-advantage", g.describeGame());
    }

    @Test
    void shouldReturnDeuceIfScoresAreGreaterThan3AndEquals() {
        Game g = new Game(new Player(3), new Player(3));
        Assertions.assertEquals("deuce", g.describeGame());
    }

    @Test
    void shouldReturnPLayer1WinsIfScoreIsGreaterThan4AndDifferences2() {
        Game g = new Game(new Player(5), new Player(3));
        Assertions.assertEquals("Player 1 wins", g.describeGame());
    }
    @Test
    void shouldReturnPLayer2WinsIfScoreIsGreaterThan4AndDifferences2() {
        Game g = new Game(new Player(4), new Player(6));
        Assertions.assertEquals("Player 2 wins", g.describeGame());
    }

}