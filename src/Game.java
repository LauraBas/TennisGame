public class Game {
    Player player1;
    Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String describeGame() {
        if (player1.getScore() >= 3 && player2.getScore() >=3) {
            if(player1Wins()) {
                return "Player 1 wins";
            }
            if(player2Wins()) {
                return "Player 2 wins";
            }
            if (advantageForPlayer1()) {
                return "advantage-" + this.player2.getDescription();
            }
            if (advantageForPlayer2()) {
                return this.player1.getDescription() + "-advantage";
            }
            if (isDeuce()) {
                return "deuce";
            }
        }
       return this.player1.getDescription() + "-" + this.player2.getDescription();
    }

    private boolean advantageForPlayer2() {
        return player2.getScore() - player1.getScore() == 1;
    }

    private boolean advantageForPlayer1() {
        return player1.getScore() - player2.getScore() == 1;
    }

    private boolean isDeuce() {
        return player2.getScore() == player1.getScore();
    }

    private boolean player2Wins() {
        return (player2.getScore() >= 4) && player2.getScore() - player1.getScore() >= 2;
    }

    private boolean player1Wins() {
        return (player1.getScore() >= 4) && player1.getScore() - player2.getScore() >= 2;
    }
}
