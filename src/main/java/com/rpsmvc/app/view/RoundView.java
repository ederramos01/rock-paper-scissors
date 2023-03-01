package com.rpsgame.app.game.view;

import java.util.ArrayList;

import com.rpsgame.app.game.controller.PlayerController;
import com.rpsgame.app.game.model.ShapesModel;

public class RoundView {
    
    ShapesModel p1option;
    ShapesModel p2option;
    ArrayList<ShapesModel> arrayOptions = new ArrayList<>();
    
    public ArrayList<ShapesModel> pickUpAShape(PlayerController player1, PlayerController player2){
        System.out.println("# P1 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#\n");

        p1option = player1.chooseAShape();
        arrayOptions.add(p1option); 
        System.out.println("# P2 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#");
                
        p2option = player2.chooseAShape();
        arrayOptions.add(p2option);

        return arrayOptions;
    }

}
