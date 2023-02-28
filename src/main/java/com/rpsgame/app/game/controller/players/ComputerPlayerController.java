package com.rpsgame.app.game.controller.players;

import java.util.Random;

import com.rpsgame.app.game.controller.PlayerController;
import com.rpsgame.app.game.model.PlayerModel;
import com.rpsgame.app.game.model.ShapesModel;
import com.rpsgame.app.game.model.TypePlayerModel;

public class ComputerPlayerController extends PlayerController {

    PlayerModel playerModel;

    public ComputerPlayerController() {
        this.id_typePlayer = TypePlayerModel.IA;
        this.playerModel = new PlayerModel("Computer", this.id_typePlayer);
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

    //Setter of Model's Player
    public void setTypePlayer(TypePlayerModel typePlayer) {
        playerModel.setId_typePlayer(typePlayer);
    }
}
