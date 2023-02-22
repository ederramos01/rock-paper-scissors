package com.rpsgame.app.game.controller;

import com.rpsgame.app.game.model.MatchHistory;
import com.rpsgame.app.game.model.PlayerModel;
import com.rpsgame.app.game.util.Console;

public class HumanPlayerController extends PlayerController {

    PlayerModel playerModel;

    public HumanPlayerController(String name) {
        PlayerController.id_player++;
        this.name = name;
        this.id_typePlayer = TypePlayerController.HUMANPLAYER;
        this.playerModel = new PlayerModel(PlayerController.id_player, this.name, this.id_typePlayer);
        MatchHistory.addHistoryPlayers(this.playerModel);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ShapesController chooseAShape() {
        int option = Console.getInt("#SELECT AN OPTION: ");
        return switch (option){
            case 1 -> ShapesController.Rock;
            case 2 -> ShapesController.Scissors;
            case 3 -> ShapesController.Paper;
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
    }
    
    @Override
    public TypePlayerController typePlayer() {
        return this.id_typePlayer;
    }
    
    //Setter of Model's Player
    public void setIdPlayer(int id_player){
        playerModel.setId_player(id_player);
    }

    public void setName(String name){
        playerModel.setName(name);
    }

    public void setTypePlayer(TypePlayerController typePlayer) {
        playerModel.setId_typePlayer(typePlayer);
    }
}
