package com.rpsgame.app.game.players;

import java.util.Random;

import com.rpsgame.app.game.controller.PlayerController;
import com.rpsgame.app.game.model.ShapesModel;
import com.rpsgame.app.game.model.TypePlayerModel;

public class ComputerPlayer extends PlayerController {

    public ComputerPlayer() {
        this.id_typePlayer = TypePlayerModel.IA;
    }

    @Override
    public ShapesModel chooseAShape() {
        Random myRandom = new Random();
        int option = myRandom.nextInt(3) + 1;
        return switch (option){
            case 1 -> ShapesModel.Rock;
            case 2 -> ShapesModel.Scissors;
            case 3 -> ShapesModel.Paper;
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
    }

    @Override
    public TypePlayerModel typePlayer() {
        return TypePlayerModel.IA;
    }

    @Override
    public String getName() {
        return "Computer Player";
    }
}
