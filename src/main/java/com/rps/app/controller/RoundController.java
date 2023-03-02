package com.rps.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.rps.app.controller.player.PlayerController;
import com.rps.app.model.MatchModel;
import com.rps.app.model.RoundModel;
import com.rps.app.model.ScoreModel;
import com.rps.app.model.player.PlayerModel;
import com.rps.app.utils.Shape;
import com.rps.app.view.RoundView;

public class RoundController {

    private PlayerController[] playersController;
    private ScoreModel score;
    private RoundView roundView;

    public RoundController() {
        roundView = new RoundView();
    }

    public void setScore(ScoreModel scoreModel) {
        this.score = scoreModel;
    }

    public void setPlayerController(PlayerController[] playersController) {
        this.playersController = playersController;
    }

    public void executeRounds() {
        // if(score == null && playersController == null){
        // return;
        // }
        if (score.getP1Score() < 3 && score.getP2Score() < 3) {
            score.updateRoundNumber();
            int currentRound = score.getRoundNumber();
            RoundModel round = new RoundModel(currentRound);
            runningRound(round);
        } else {
            getLastWinner();
        }
    }

    public PlayerModel getLastWinner() {
        if(score.getP1Score() == 3) {
            return playersController[0].getPlayer();
        }
        if(score.getP2Score() == 3) {
            return playersController[1].getPlayer();
        }
        return null;
    }

    public void runningRound(RoundModel round) {
        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList = roundView.pickUpAShape(playersController, round.getRoundNumber(), score.getScoreList());
        round.setPlayer1Shape(shapesList.get(0));
        round.setPlayer2Shape(shapesList.get(1));
        int winner = ROCKPAPERSCISSOR(shapesList);
        if(winner >= 0  && winner < 2 ){
            round.setWinnerOfThisRound(playersController[winner].getPlayer());
        } else{
            round.isATie();
        }
        announceWinnerOfTheRound(shapesList, winner, playersController, score.getScoreList());
    }

    
    private int ROCKPAPERSCISSOR(List<Shape> playerShapes) {
        System.out.println("##READY . . . ?\n" +
                "#\n" +
                "#\n");
        if ((playerShapes.get(0) == Shape.Paper && playerShapes.get(1) == Shape.Rock)) {
            updateScoreGame(0);
            return 0;
        }
        if ((playerShapes.get(0) == Shape.Paper && playerShapes.get(1) == Shape.Scissors)) {
            updateScoreGame(1);
            return 1;
        }
        if ((playerShapes.get(0) == Shape.Paper && playerShapes.get(1) == Shape.Paper)) {
            updateScoreGame(2);
            return 2;
        }
        if ((playerShapes.get(0) == Shape.Rock && playerShapes.get(1) == Shape.Rock)) {
            updateScoreGame(2);
            return 2;
        }
        if ((playerShapes.get(0) == Shape.Rock && playerShapes.get(1) == Shape.Scissors)) {
            updateScoreGame(0);
            return 0;
        }
        if ((playerShapes.get(0) == Shape.Rock && playerShapes.get(1) == Shape.Paper)) {
            updateScoreGame(1);
            return 1;
        }
        if ((playerShapes.get(0) == Shape.Scissors && playerShapes.get(1) == Shape.Rock)) {
            updateScoreGame(1);
            return 1;
        }
        if ((playerShapes.get(0) == Shape.Scissors && playerShapes.get(1) == Shape.Scissors)) {
            updateScoreGame(2);
            return 2;
        }
        if ((playerShapes.get(0) == Shape.Scissors && playerShapes.get(1) == Shape.Paper)) {
            updateScoreGame(0);
            return 0;
        }
        return 0;
    }

    private void announceWinnerOfTheRound(List<Shape> playerShapes, int winner, PlayerController[] playersController, List<Integer> score) {
        roundView.announceWinnerView(playerShapes, winner, playersController, score);
        executeRounds();
    }

    private void updateScoreGame(int assingPoint) {
        if (assingPoint == 0) {
            score.updateP1Score();
        }
        if (assingPoint == 1) {
            score.updateP2Score();
        }
    }
}
