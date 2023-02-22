package com.rps.app.model;

import com.rpsgame.app.game.Score;
import com.rpsgame.app.game.players.Shapes;

public class RoundModel {

    private int roundNumber;
    private Score score;
    private Shapes player1Shape;
    private Shapes player2Shape;

    public RoundModel(Score score, int roundNumber) {
        this.score = score;
        this.roundNumber = roundNumber;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public Score getScore() {
        return score;
    }

    public void setP1Score() {
        score.updateP1Score();
    }

    public void setP2Score() {
        score.updateP2Score();
    }

    public Shapes getPlayer1Shape() {
        return player1Shape;
    }

    public void setPlayer1Shape(Shapes player1) {
        this.player1Shape = player1;
    }

    public Shapes getPlayer2Shape() {
        return player2Shape;
    }

    public void setPlayer2Shape(Shapes player2) {
        this.player2Shape = player2;
    }
}
