package com.rpsgame.app.game.model;

import java.util.ArrayList;
import java.util.List;

public class ScoreModel {

    private static int idScore = 0;
    private String namePlayer1;
    private String namePlayer2;
    private List<Integer> p1Score = new ArrayList<>();
    private List<Integer> p2Score = new ArrayList<>();
    
    public ScoreModel() {
        ScoreModel.idScore++;
    }

    public void setNamePlayer1(String namePlayer1) {
        this.namePlayer1 = namePlayer1;
    }

    public void setNamePlayer2(String namePlayer2) {
        this.namePlayer2 = namePlayer2;
    }

    public void setP1Score(int p1Score) {
        this.p1Score.add(p1Score);
    }

    public void setP2Score(int p2Score) {
        this.p2Score.add(p2Score);
    }

    public String getNamePlayer1() {
        return namePlayer1;
    }

    public String getNamePlayer2() {
        return namePlayer2;
    }

    public List<Integer> getP1Score() {
        return p1Score;
    }

    public List<Integer> getP2Score() {
        return p2Score;
    }

    @Override
    public String toString() {
        return "ScoreModel [namePlayer1=" + namePlayer1 + ", namePlayer2=" + namePlayer2 + ", p1Score=" + p1Score
                + ", p2Score=" + p2Score + "]";
    }

    
    
}
