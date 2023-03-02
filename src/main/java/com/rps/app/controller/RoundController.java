package com.rps.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.rps.app.controller.player.PlayerController;
import com.rps.app.model.RoundModel;
import com.rps.app.model.ScoreModel;
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
            // filtrar la primera ronda
            if (score.getRoundNumber() != 0) {
                score.updateRoundNumber();
            }
            int currentRound = score.getRoundNumber();
            RoundModel round = new RoundModel(currentRound);
            runningRound(round);
        }
    }

    public void runningRound(RoundModel round) {
        ArrayList<Shape> shapesList = new ArrayList<>();
        int[] scores = new int[2];
        scores[0] = score.getP1Score();
        scores[1] = score.getP2Score();
        shapesList = roundView.pickUpAShape(playersController, round.getRoundNumber(), scores);
        round.setPlayer1Shape(shapesList.get(0));
        round.setPlayer2Shape(shapesList.get(1));
        int winner = ROCKPAPERSCISSOR(shapesList);
        if(winner >= 0  || winner < 2 ){
            round.setWinnerOfThisRound(playersController[winner].getPlayer());
        }
        announceWinnerOfTheRound(shapesList, winner, playersController, scores);
    }

    
    private int ROCKPAPERSCISSOR(List<Shape> playerShapes) {
        System.out.println("##READY . . . ?\n" +
                "#\n" +
                "#\n");
        if ((playerShapes.get(0) == Shape.Paper && playerShapes.get(1) == Shape.Rock)) {
            updateScoreGame(0); // si es 1 gana p1
            return 0;
        }
        if ((playerShapes.get(0) == Shape.Paper && playerShapes.get(1) == Shape.Scissors)) {
            updateScoreGame(1); // si es 2 gana p2
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

    private void announceWinnerOfTheRound(List<Shape> playerShapes, int winner, PlayerController[] playersController, int[] score) {
        roundView.announceWinnerView(playerShapes, winner, playersController, score);
        executeRounds();
    }

    private void updateScoreGame(int assingPoint) {
        if (assingPoint == 0) {
            score.updateP1Score();
            //revisar que el que llegue a 3 puntos primero asignarle el ganador del match con un metodo 
            // debemos acceder al modelo general para poder asignar ahi el PlayerModel winner
        }
        if (assingPoint == 1) {
            score.updateP2Score();
        }
    }
}
