package com.rpsmvc.app.controller;

import java.util.ArrayList;

import com.rpsmvc.app.model.MatchModel;
import com.rpsmvc.app.model.ShapesModel;
import com.rpsmvc.app.view.RoundView;

public class RoundController {

    private int roundNumber;
    private ScoreController score;

    //private static int p1Score;
    //private static int p2Score;

    private PlayerController player1;
    private PlayerController player2;

    //==> Primero relacionamos el playerModel que de hecho ya esta
    //==> Luego de eso la instancia se debe de almacenar en el Match

    MatchModel matchModel = new MatchModel();
    RoundView roundView = new RoundView();

    ArrayList<ShapesModel> arrayShapes = new ArrayList<>();

    public RoundController(ScoreController score, int roundNumber, ArrayList<PlayerController> player){
        this.score = score;
        this.player1 = (PlayerController) player.get(0);
        this.player2 = (PlayerController) player.get(1);
        this.roundNumber = roundNumber;
        runningRound();
    }
    //==> this can be in the view
    private void runningRound(){
        System.out.println("#YOU ARE PLAYING NOW !!!\n" +
                "#ROUND " + roundNumber + ":\n" +
                "#LIVE SCORE: P1 = " + score.getP1Score() + " || P2 = " + score.getP2Score() +
                "\n#====================================================");
        arrayShapes = roundView.pickUpAShape(player1, player2);
        ROCKPAPERSCISSOR(arrayShapes.get(0), arrayShapes.get(1));
    }

    private void ROCKPAPERSCISSOR(ShapesModel p1option, ShapesModel p2option){
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

    private void announceWinnerOfTheRound(ShapesModel p1, ShapesModel p2, int winner) {
        // # ROCK BEATS SCISSORS 
        //# PLAYER 2 WINS!!!!! P2 HAVE SCORED 1 POINT OUT OF 3.
        if(winner == 1){
            System.out.println("# " + p1.toString() + " BEATS " + p2.toString());
            System.out.println("# " + player1.getName() + " WINS!!!!! " + player1.typePlayer() + " HAVE SCORED " + score.getP1Score() + " POINT OUT OF 3.");
        }
        if(winner == 2){
            System.out.println("# " + p2.toString() + " BEATS " + p1.toString());
            System.out.println("# " + player2.getName() + " WINS!!!!! " + player2.typePlayer() + " HAVE SCORED " + score.getP2Score() + " POINT OUT OF 3.");
        }
        if(winner == 3){
            System.out.println("# DRAW . . . " + p1.toString() + " are the same with " + p2.toString());
        }

    }

    private void updateScoreGame(int assingPoint){
        if(assingPoint == 1){
            score.updateP1Score();
        }
        if(assingPoint == 2){
            score.updateP2Score();
        }
    }

    public ScoreController returnScoreInfo(){
        return this.score;
        // List<Integer> myList = new ArrayList<>();
        // myList.add(0, p1Score);
        // myList.add(1, p2Score);
        // return myList;
    }
}
