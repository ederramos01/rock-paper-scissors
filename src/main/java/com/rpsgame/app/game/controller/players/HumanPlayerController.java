package com.rpsgame.app.game.controller.players;

import com.rpsgame.app.game.controller.PlayerController;
import com.rpsgame.app.game.model.ShapesModel;
import com.rpsgame.app.game.model.TypePlayerModel;
import com.rpsgame.app.game.util.Console;

public class HumanPlayerController extends PlayerController {

    public HumanPlayerController(String name) {
        this.name = name;
        this.id_typePlayer = TypePlayerModel.HUMANPLAYER;
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
}
