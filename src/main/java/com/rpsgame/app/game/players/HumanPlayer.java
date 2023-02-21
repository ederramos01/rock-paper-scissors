package com.rpsgame.app.game.players;

import com.rpsgame.app.game.util.Console;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        this.name = name;
        this.id_typePlayer = TypePlayer.HUMANPLAYER;
    }

    @Override
    public Shapes chooseAShape() {
        int option = Console.getInt("#SELECT AN OPTION: ");
        return switch (option){
            case 1 -> Shapes.Rock;
            case 2 -> Shapes.Scissors;
            case 3 -> Shapes.Paper;
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
    }
    
    @Override
    public TypePlayer typePlayer() {
        return this.id_typePlayer;
    }
}
