package com.rps.app.model;

public class RPSGame {
    
    // array de matches
    MatchModel matchModel;

    public RPSGame() {
        this.matchModel = new MatchModel();
    }

    public MatchModel getMatch() {
        return this.matchModel;
    }
}
