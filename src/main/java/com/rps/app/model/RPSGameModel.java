package com.rps.app.model;

public class RPSGameModel {
    
    // array de matches
    MatchModel matchModel;

    public RPSGameModel() {
        this.matchModel = new MatchModel();
    }

    public MatchModel getMatch() {
        return this.matchModel;
    }
}
