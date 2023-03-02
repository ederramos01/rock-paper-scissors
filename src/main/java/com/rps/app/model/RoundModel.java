package com.rps.app.model;

import com.rps.app.utils.Shape;
import com.rpsgame.app.game.Score;

public class RoundModel {

    private int roundNumber;
    private Score score;
    private Shape player1Shape;
    private Shape player2Shape;

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

    public Shape getPlayer1Shape() {
        return player1Shape;
    }

    public void setPlayer1Shape(Shape player1) {
        this.player1Shape = player1;
    }

    public Shape getPlayer2Shape() {
        return player2Shape;
    }

    public void setPlayer2Shape(Shape player2) {
        this.player2Shape = player2;
    }
}
