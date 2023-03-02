package com.rps.app.model;

import com.rps.app.model.player.PlayerModel;
import com.rps.app.utils.Shape;

public class RoundModel {

    private int roundNumber;
    //private ArrayList<Shapes> shapesList;
    private Shape player1Shape;
    private Shape player2Shape;
    private PlayerModel winner;


    public RoundModel(int currentRound) {
        this.roundNumber = currentRound;
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
}
