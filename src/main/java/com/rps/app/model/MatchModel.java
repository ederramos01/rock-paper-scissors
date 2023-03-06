package com.rps.app.model;

import java.util.ArrayList;

import com.rps.app.model.player.PlayerModel;


public class MatchModel {

    private PlayerModel[] players;
    private ScoreModel score;
    private ArrayList<RoundModel> rounds;
    private PlayerModel winner;

    public void newMatch(PlayerModel[] players) {
        this.players = new PlayerModel[2];
        this.rounds = new ArrayList<>();
        this.score = new ScoreModel();
    }

    public ScoreModel getScore() {
        return this.score;
    }

    public void addRound(RoundModel round) {
        this.rounds.add(round);
    }

    public void addRoundsList(ArrayList<RoundModel> list) {
        rounds = list;
    }

    public ArrayList<RoundModel> getRoundsList() {
        return this.rounds;
    }

    public RoundModel getRound(int i) {
        return this.rounds.get(i);
    }

    public PlayerModel getWinner() {
        return winner;
    }

    public void setWinner(PlayerModel winner) {
        this.winner = winner;
    }
}
