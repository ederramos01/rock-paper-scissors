package com.rps.app.model;

import java.util.ArrayList;

public class ScoreModel {
    
    private int roundNumber;
    private int p1Score;
    private int p2Score;

    public ScoreModel() {
        roundNumber = 0;
        p1Score = 0;
        p2Score = 0;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void updateRoundNumber() {
        roundNumber++;
    }

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

    public ArrayList<Integer> getScoreList() {
        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(p1Score);
        scoreList.add(p2Score);
        return scoreList;
    }
}
