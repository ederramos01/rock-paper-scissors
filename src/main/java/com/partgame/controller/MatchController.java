package com.partgame.controller;

import java.util.ArrayList;

public class MatchController {

    /**
     * esta clase tiene que ejecutar tantas rondas segun la siguiente condicion
     * p1Score <= 3 o p2Score <= 3
     */

    private ArrayList<PlayerController> players;
    private ArrayList<RoundController> rounds;
    private ScoreController score;
    private int roundNumber;

    public MatchController(ArrayList<PlayerController> players) {
        this.score = new ScoreController();
        this.roundNumber = 1;
        this.rounds = new ArrayList<>();
        this.players = players;
        executeInitialRound(roundNumber, players, score);
    }

    private void executeInitialRound(int roundNumber, ArrayList<PlayerController> players, ScoreController score) {
        RoundController round = new RoundController(score, roundNumber, players);
        updateRoundNumber(round);
        checkScore(round);
    }

    private void executeRounds(ScoreController score) {
        RoundController round = new RoundController(score, roundNumber, players);
        updateRoundNumber(round);
        checkScore(round);
    }

    private void checkScore(RoundController round) {
        score = round.returnScoreInfo();
        if( score.getP1Score() < 3 && score.getP2Score() < 3 ){
            executeRounds(score);
        } else{
            announceWinnerOfTheMatch();
        }
    }

    private void announceWinnerOfTheMatch() {
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

    private void updateRoundNumber(RoundController round) {
        rounds.add(round);
        this.roundNumber++;
    }
}