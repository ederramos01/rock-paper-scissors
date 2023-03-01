package com.rpsmvc.app.controller.players;

import com.rpsmvc.app.controller.PlayerController;
import com.rpsmvc.app.model.PlayerModel;
import com.rpsmvc.app.model.ShapesModel;
import com.rpsmvc.app.model.TypePlayerModel;
import com.rpsmvc.app.util.Console;

public class HumanPlayerController extends PlayerController {

    PlayerModel playerModel;

    public HumanPlayerController(String name) {
        this.name = name;
        this.id_typePlayer = TypePlayerModel.HUMANPLAYER;
        this.playerModel = new PlayerModel(this.name, this.id_typePlayer);
    }

    @Override
    public String getName() {
        return this.name;
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
