public class Player {
    int score;


    public Player(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getDescription() {
        if (this.score == 0) {
            return "love";
        }
        if (this.score == 1) {
            return "fifteen";
        }
        if (this.score == 2) {
            return "thirty";
        }
        if (this.score == 3) {
            return "forty";
        }
        return null;
    }

}
