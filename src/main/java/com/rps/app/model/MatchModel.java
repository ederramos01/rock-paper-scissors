package com.rps.app.model;

import java.util.ArrayList;

import com.rps.app.model.player.PlayerModel;


public class MatchModel {

    private PlayerModel[] players;
    private ScoreModel score;
    private ArrayList<RoundModel> rounds;

    public void newMatch(PlayerModel[] players) {
        this.players = players;
        this.score = new ScoreModel();
        this.rounds = new ArrayList<>();
    }

    public ScoreModel getScore() {
        return this.score;
    }

    public ArrayList<RoundModel> getRoundsList() {
        return this.rounds;
    }

    public RoundModel getRound(int i) {
        return this.rounds.get(i);
    }

    // public Player[] getPlayers() {
    //     return players.clone();
    // }
}
