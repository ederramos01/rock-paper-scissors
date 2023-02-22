package com.rps.app.model;

import java.util.ArrayList;

import com.rpsgame.app.game.Round;
import com.rpsgame.app.game.Score;
import com.rpsgame.app.game.players.Player;

public class MatchModel {

    private ArrayList<Round> rounds;
    private int roundNumber;
    private Score score;
    private Player player1;
    private Player player2;

    public MatchModel(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.score = new Score();
        this.roundNumber = 1;
        this.rounds = new ArrayList<>();
    }
    
    public void setPlayer1(Player player) {
        this.player1 = player;
    }

    public void setPlayer2(Player player) {
        this.player2 = player;
    }

    public void addRoundToMatch(Round round) {
        this.rounds.add(round);
    }

    public void setRoundNumber() {
        this.roundNumber++;
    }

    public void setGlobalScore(Score score) {
        this.score = score;
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public Round getSpecificRound(int roundNumber) {
        return this.rounds.get(roundNumber);
    }

    public ArrayList<Round> getRounds() {
        return this.rounds;
    }

    public int getRoundNumber() {
        return this.roundNumber;
    }

    public Score getCurrentScore() {
        return this.score;
    }
}
