package com.rps.app.model;

public class RPSGame {
    
    // array de matches
    MatchModel matchModel;
    public RPSGame() {
        this.matchModel = new MatchModel();
    }

    public void newMatch() {
    }

    public MatchModel getMatch() {
        return this.matchModel;
    }
}
