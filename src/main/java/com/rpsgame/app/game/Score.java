package com.rpsgame.app.game;


import com.rpsgame.app.game.controller.PlayerController;
import com.rpsgame.app.game.model.MatchHistory;
import com.rpsgame.app.game.model.ScoreModel;

public class Score {

    ScoreModel scoreModel = new ScoreModel();

    private int p1Score;
    private int p2Score;

    public int getP1Score() {
        return p1Score;
    }

    public int getP2Score() {
        return p2Score;
    }

    public void updateP1Score(PlayerController player1){
        p1Score++;
        scoreModel.setP1Score(p1Score);
        scoreModel.setNamePlayer1(player1.getName());
        MatchHistory.addHistoryScore(scoreModel);
    }

    public void updateP2Score(PlayerController player2) {
        p2Score++;
        scoreModel.setP2Score(p2Score);
        scoreModel.setNamePlayer2(player2.getName());
        MatchHistory.addHistoryScore(scoreModel);
    }
}
