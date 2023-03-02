package com.rps.app.view;

import java.util.ArrayList;

import com.rps.app.controller.player.PlayerController;
import com.rps.app.model.ScoreModel;
import com.rps.app.utils.Shape;

public class RoundView {
    
    public ArrayList<Shape> pickUpAShape(PlayerController player1, PlayerController player2) {
        
        Shape p1option;
        Shape p2option;
        ArrayList<Shape> arrayOptions = new ArrayList<>();

        System.out.println("#YOU ARE PLAYING NOW !!!\n" +
                //"#ROUND " + roundNumber + ":\n" +
                //Pendiente de implementar, se recibira como parametro el score al anunciar el ganador
                // "#LIVE SCORE: P1 = " + score.getP1Score() + " || P2 = " + score.getP2Score() +
                "\n#====================================================");
        
                System.out.println("# P1 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#\n");

        p1option = player1.selectShape();
        arrayOptions.add(p1option);
        System.out.println("# P2 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#");
                
        p2option = player2.selectShape();
        arrayOptions.add(p2option);

        return arrayOptions;
    }

    public void announceWinnerView(Shape p1, Shape p2, int winner, PlayerController[] playersController, ScoreModel scoreModel) {
        if(winner == 1){
            System.out.println("# " + p1.toString() + " BEATS " + p2.toString());
            System.out.println("# " + playersController[0].getName() + " WINS!!!!!  HAVE SCORED " + scoreModel.getP1Score() + " POINT OUT OF 3.");
        }
        if(winner == 2){
            System.out.println("# " + p2.toString() + " BEATS " + p1.toString());
            System.out.println("# " + playersController[1].getName() + " WINS!!!!!  HAVE SCORED " + scoreModel.getP2Score() + " POINT OUT OF 3.");
        }
        if(winner == 3){
            System.out.println("# DRAW . . . " + p1.toString() + " are the same with " + p2.toString());
        }
    }

}
