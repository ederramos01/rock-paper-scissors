package com.rps.app.controller;

import java.util.ArrayList;

import com.rps.app.controller.player.PlayerController;
import com.rps.app.model.RoundModel;
import com.rps.app.model.ScoreModel;
import com.rps.app.utils.Shape;
import com.rps.app.view.RoundView;

public class RoundController {

    private int roundNumber = 0; //numero de rondas
    private PlayerController[] playersController;
    private ScoreModel scoreModel;
    private ArrayList<RoundModel> roundModel;
    private RoundView roundView = new RoundView();

    private ArrayList<Shape> arrayOptions = new ArrayList<>();


	public void setPlayerController(PlayerController[] playersController) {
        this.playersController = playersController;
	}
    //no se ha ingresado ningun metodo que ingrese la ronda
    public void setRound(ArrayList<RoundModel> roundsList) {
        this.roundModel = roundsList;
    }

    public void setScore(ScoreModel score) {
        this.scoreModel = score;
    }

    public void runningRound() {
        arrayOptions = roundView.pickUpAShape(playersController[0], playersController[1]);
        ROCKPAPERSCISSOR(arrayOptions.get(0), arrayOptions.get(1));
    }
    
    private void ROCKPAPERSCISSOR(Shape p1option, Shape p2option){
        System.out.println("##READY . . . ?\n" +
                "#\n" +
                "#\n");
        if( (p1option.toString() == "Paper" && p2option.toString()== "Rock") ){
            updateScoreGame(1); //si es 1 gana p1
            announceWinnerOfTheRound(p1option, p2option, 1);
        }
        if( (p1option.toString() == "Paper" && p2option.toString()== "Scissors") ){
            updateScoreGame(2); //si es 2 gana p2
            announceWinnerOfTheRound(p1option, p2option, 2);
        }
        if( (p1option.toString() == "Paper" && p2option.toString()== "Paper") ){
            updateScoreGame(3);
            announceWinnerOfTheRound(p1option, p2option, 3);
        }
        if( (p1option.toString() == "Rock" && p2option.toString()== "Rock") ){
            updateScoreGame(3);
            announceWinnerOfTheRound(p1option, p2option,3);
        }
        if( (p1option.toString() == "Rock" && p2option.toString()== "Scissors") ){
            updateScoreGame(1);
            announceWinnerOfTheRound(p1option, p2option, 1);
        }
        if( (p1option.toString() == "Rock" && p2option.toString()== "Paper") ){
            updateScoreGame(2);
            announceWinnerOfTheRound(p1option, p2option, 2);
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "Rock") ){
            updateScoreGame(2);   
            announceWinnerOfTheRound(p1option, p2option, 2); 
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "Scissors") ){
            updateScoreGame(3);
            announceWinnerOfTheRound(p1option, p2option, 3);
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "Paper") ){
            updateScoreGame(1);
            announceWinnerOfTheRound(p1option, p2option, 1);
        }
    }

    private void announceWinnerOfTheRound(Shape p1, Shape p2, int winner) {
        
        roundView.announceWinnerView(p1, p2, winner, playersController, scoreModel);
        
    }

    private void updateScoreGame(int assingPoint){
        roundNumber++;
        if(assingPoint == 1){
            scoreModel.updateP1Score();
        }
        if(assingPoint == 2){
            scoreModel.updateP2Score();
        }
    }

}
