package com.rps.app.model;

import com.rps.app.model.player.PlayerModel;
import com.rps.app.utils.Shape;

public class RoundModel {

    private int roundNumber;
    private Shape player1Shape;
    private Shape player2Shape;
    private PlayerModel winner;
    private boolean isTie;


    public RoundModel(int currentRound) {
        this.roundNumber = currentRound;
        this.isTie = false;
    }

    public int getRoundNumber() {
        return roundNumber;
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

    public PlayerModel getWinner() {
        return winner;
    }

    public void setWinnerOfThisRound(PlayerModel winner) {
        this.winner = winner;
    }

    public void isATie() {
        this.isTie = true;
    }

}
