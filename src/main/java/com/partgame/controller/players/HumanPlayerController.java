package com.partgame.controller.players;

import com.partgame.controller.PlayerController;
import com.partgame.model.PlayerModel;
import com.partgame.model.ShapesModel;
import com.partgame.model.TypePlayerModel;
import com.rpsgame.app.game.util.Console;

public class HumanPlayerController extends PlayerController {

    PlayerModel playerModel;

    public HumanPlayerController(String name) {
        this.name = name;
        this.id_typePlayer = TypePlayerModel.HUMANPLAYER;
        this.playerModel = new PlayerModel(this.name, this.id_typePlayer);
    }

    @Override
    public String getName() {
        // return this.name;
        return playerModel.getName();
    }

    @Override
    public ShapesModel chooseAShape() {
        int option = Console.getInt("#SELECT AN OPTION: ");
        return switch (option){
            case 1 -> ShapesModel.Rock;
            case 2 -> ShapesModel.Scissors;
            case 3 -> ShapesModel.Paper;
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
    }
    
    @Override
    public TypePlayerModel typePlayer() {
        return this.id_typePlayer;
    }

    //Setter of Model's Player
    public void setName(String name){
        playerModel.setName(name);
    }

    public void setTypePlayer(TypePlayerModel typePlayer) {
        playerModel.setId_typePlayer(typePlayer);
    }
}
