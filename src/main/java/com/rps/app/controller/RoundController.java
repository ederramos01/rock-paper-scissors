package com.rps.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.rps.app.controller.player.PlayerController;
import com.rps.app.model.RoundModel;
import com.rps.app.model.ScoreModel;
import com.rps.app.model.player.PlayerModel;
import com.rps.app.utils.Shape;
import com.rps.app.view.RoundView;

public class RoundController {

    private PlayerController[] playersController;
    private ScoreModel score;
    private RoundView roundView;
    private ArrayList<RoundModel> rounds;

    public RoundController() {
        roundView = new RoundView();
        rounds = new ArrayList<>();
    }

    public void setScore(ScoreModel scoreModel) {
        this.score = scoreModel;
    }

    public void setPlayerController(PlayerController[] playersController) {
        this.playersController = playersController;
    }

    public void addRound(RoundModel round) {
       rounds.add(round);
    }

    public ArrayList<RoundModel> getRounds() {
        return this.rounds;
    }

    public void setupNewRound() {
        if (score.getP1Score() < 3 && score.getP2Score() < 3) {
            score.updateRoundNumber();
            RoundModel round = new RoundModel(score.getRoundNumber());
            addRound(round);
            executeRound(round);
        }
    }

    public void executeRound(RoundModel round) {
        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList = roundView.selectShapes(playersController, round.getRoundNumber(), score.getScoreList());
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
        roundView.announceMatchBeginning();
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
        setupNewRound();
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

    private void updateScoreGame(int assingPoint) {
        if (assingPoint == 0) {
            score.updateP1Score();
        }
        if (assingPoint == 1) {
            score.updateP2Score();
        }
    }
}
