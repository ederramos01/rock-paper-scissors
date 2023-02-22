package com.rpsgame.app.game.controller;

import java.util.Random;

import com.rpsgame.app.game.model.PlayerModel;

public class ComputerPlayerController extends PlayerController {

    PlayerModel playerModel;

    public ComputerPlayerController() {
        PlayerController.id_player++;
        this.id_typePlayer = TypePlayerController.IA;
        this.playerModel = new PlayerModel(PlayerController.id_player, "Computer", this.id_typePlayer);
    }

    @Override
    public ShapesController chooseAShape() {
        Random myRandom = new Random();
        int option = myRandom.nextInt(3) + 1;
        return switch (option){
            case 1 -> ShapesController.Rock;
            case 2 -> ShapesController.Scissors;
            case 3 -> ShapesController.Paper;
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
    }

    @Override
    public TypePlayerController typePlayer() {
        setTypePlayer(TypePlayerController.IA);
        return TypePlayerController.IA;
    }

    @Override
    public String getName() {
        return "Computer Player";
    }

    //Setter of Model's Player
    public void setIdPlayer(int id_player){
        playerModel.setId_player(id_player);
    }

    public void setTypePlayer(TypePlayerController typePlayer) {
        playerModel.setId_typePlayer(typePlayer);
    }
}
