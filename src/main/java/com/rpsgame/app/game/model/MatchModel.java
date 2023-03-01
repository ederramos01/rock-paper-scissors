package com.rpsgame.app.game.model;

public class MatchModel {
    
    private PlayerModel[] players;
    private ScoreModel score;
    private RoundModel round;

    public MatchModel() {
        this.score = new ScoreModel();
        this.round = new RoundModel();
    }

    public PlayerModel[] getPlayers() {
        return players;
    }

    public ScoreModel getScore() {
        return score;
    }

    public RoundModel getRound() {
        return round;
    }

    public void setPlayers(PlayerModel[] players) {
        this.players = players;
    }

    public void setScore(ScoreModel score) {
        this.score = score;
    }

    public void setRound(RoundModel round) {
        this.round = round;
    }

}
