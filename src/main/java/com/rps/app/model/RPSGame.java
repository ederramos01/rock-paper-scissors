package com.rps.app.model;

public class RPSGame {
    
    Match matchModel;

    public void newMatch() {
        this.matchModel = new Match();
    }

    public Match getMatch() {
        return this.matchModel;
    }
}
