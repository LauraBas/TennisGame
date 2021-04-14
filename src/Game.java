import java.util.ArrayList;
import java.util.List;

public class Game {
    Player player1;
    Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String describeGame() {
       return this.player1.getDescription() + "-" + this.player2.getDescription();
    }
}
