package com.rps.app.model;

public class GameModel {
    
    MatchModel matchModel;
    PlayerModel playerModel;
    RoundModel roundModel;
    ScoreModel scoreModel;

    public GameModel() {
        this.matchModel = new MatchModel(null, null)
        this.playerModel = new PlayerModel();
        this.roundModel = new RoundModel(null, 0);
        this.scoreModel = new ScoreModel();
    }

    

}
