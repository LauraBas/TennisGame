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
        if (player1.getScore() >= 3 && player2.getScore() >=3) {
               if (player1.getScore() - player2.getScore() == 1) {
                   return "advantage-" + this.player2.getDescription();
               }
               if (player2.getScore() - player1.getScore() == 1) {
                    return this.player1.getDescription() + "-advantage";
               }
            if (player2.getScore() == player1.getScore()) {
                return "deuce";
            }
        }
       return this.player1.getDescription() + "-" + this.player2.getDescription();
    }
}
