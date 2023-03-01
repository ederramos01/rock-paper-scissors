package com.rps.app.model;

import java.util.ArrayList;

import com.rpsgame.app.game.Round;
import com.rpsgame.app.game.Score;
import com.rpsgame.app.game.players.Player;

public class MatchModel {

    private ArrayList<Round> rounds;
    private Score score;
    private Player[] players;

    public void newMatch(Player[] players) {
        this.players = players;
        this.score = new Score();
        this.rounds = new ArrayList<>();
    }

    public Score getScore() {
        return this.score;
    }

    public ArrayList<Round> getRoundsList() {
        return this.rounds;
    }

    public Round getRound(int i) {
        return this.rounds.get(i);
    }

    public Player[] getPlayers() {
        return players.clone();
    }
}
