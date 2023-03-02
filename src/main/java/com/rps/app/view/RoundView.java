package com.rps.app.view;

import java.util.ArrayList;
import java.util.List;

import com.rps.app.controller.player.PlayerController;
import com.rps.app.utils.Shape;

public class RoundView {

    public ArrayList<Shape> pickUpAShape(PlayerController[] playersController, int round, List<Integer> score) {
        Shape p1option;
        Shape p2option;
        ArrayList<Shape> shapesList = new ArrayList<>();

        System.out.println("#YOU ARE PLAYING NOW !!!\n" +
                "#ROUND " + round + ":\n" +
                "#LIVE SCORE: P1 = " + score.get(0) + " || P2 = " + score.get(1) +
                "\n#====================================================");
        
                System.out.println("# P1 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#\n");
        p1option = playersController[0].selectShape();
        shapesList.add(p1option);

        System.out.println("# P2 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#");
        p2option = playersController[1].selectShape();
        shapesList.add(p2option);

        return shapesList;
    }

    public void announceWinnerView(List<Shape> playerShapes, int winner, PlayerController[] playersController, List<Integer> score) {

        if(winner == 0){
            System.out.println("# " + playerShapes.get(0) + " BEATS " + playerShapes.get(1));
            System.out.println("# " + playersController[0].getName() + " WINS!!!!!  HAVE SCORED " +  score.get(0) + " POINT OUT OF 3.");
        }

        if(winner == 1){
            System.out.println("# " + playerShapes.get(1) + " BEATS " + playerShapes.get(0));
            System.out.println("# " + playersController[1].getName() + " WINS!!!!!  HAVE SCORED " +  score.get(1) + " POINT OUT OF 3.");
        }

        if(winner == 2){
            System.out.println("# DRAW . . . " + playerShapes.get(0) + " are the same with " + playerShapes.get(1));
        }
    }

}
