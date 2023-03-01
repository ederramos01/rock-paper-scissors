package com.partgame.model;

import java.util.ArrayList;
import java.util.List;

public class ScoreModel {
    
    private String namePlayer1;
    private String namePlayer2;
    private List<Integer> p1Score = new ArrayList<>();
    private List<Integer> p2Score = new ArrayList<>();

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
        return "ScoreModel - " + namePlayer1 + " with score " + p1Score + ", and " + namePlayer2 + " with score " + p2Score;
    }

}
