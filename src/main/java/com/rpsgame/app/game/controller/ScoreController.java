package com.rpsgame.app.game.controller;

public class ScoreController {

    private int p1Score;
    private int p2Score;

    public int getP1Score() {
        return p1Score;
    }

    public int getP2Score() {
        return p2Score;
    }

    public void updateP1Score(){
        p1Score++;
    }

    public void updateP2Score() {
        p2Score++;
    }
}
