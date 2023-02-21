import java.util.ArrayList;

import players.Player;

public class Match {

    /**
     * esta clase tiene que ejecutar tantas rondas segun la siguiente condicion
     * p1Score <= 3 o p2Score <= 3
     */

    private ArrayList<Player> players;
    private ArrayList<Round> rounds;
    private Score score;
    private int roundNumber;

    public Match(ArrayList<Player> players) {
        this.score = new Score();
        this.roundNumber = 1;
        this.rounds = new ArrayList<>();
        this.players = players;
        executeInitialRound(roundNumber, players, score);
    }

    private void executeInitialRound(int roundNumber, ArrayList<Player> players, Score score) {
        Round round = new Round(score, roundNumber, players);
        updateRoundNumber(round);
        checkScore(round);
    }

    private void executeRounds(Score score) {
        Round round = new Round(score, roundNumber, players);
        updateRoundNumber(round);
        checkScore(round);
    }

    private void checkScore(Round round) {
        score = round.returnScoreInfo();
        if( score.getP1Score() < 3 && score.getP2Score() < 3 ){
            executeRounds(score);
        } else{
            announceWinner();
        }
    }

    private void announceWinner() {
        String winner = "";
        if(score.getP1Score() == 3) {
            winner = "Player1 which is a " + players.get(0).typePlayer();
        }
        if(score.getP2Score() == 3) {
            winner = "Player2 which is a " + players.get(1).typePlayer();
        }
        System.out.println("# " + winner + " WON THE GAME! CONGRATULATIONS!!!!!!!!\n" +
                "#=====================================================");
    }

    private void updateRoundNumber(Round round) {
        rounds.add(round);
        this.roundNumber++;
    }
}