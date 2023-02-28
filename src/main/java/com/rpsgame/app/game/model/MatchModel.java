package com.rpsgame.app.game.model;

import java.util.ArrayList;
import java.util.List;

public class MatchModel {
    
    public List<PlayerModel> players = new ArrayList<>();
    public List<ScoreModel> score = new ArrayList<>();
    public List<RoundModel> round = new ArrayList<>();

    public List<PlayerModel> getPlayers() {
        return players;
    }
    public void setPlayers(List<PlayerModel> players) {
        this.players = players;
    }
    public List<ScoreModel> getScore() {
        return score;
    }
    public void setScore(List<ScoreModel> score) {
        this.score = score;
    }
    public List<RoundModel> getRound() {
        return round;
    }
    public void setRound(List<RoundModel> round) {
        this.round = round;
    }

}
