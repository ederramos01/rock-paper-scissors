package com.rpsgame.app.game.players;

import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer() {
        this.id_typePlayer = TypePlayer.IA;
    }

    @Override
    public Shapes chooseAShape() {
        Random myRandom = new Random();
        int option = myRandom.nextInt(3) + 1;
        return switch (option){
            case 1 -> Shapes.Rock;
            case 2 -> Shapes.Scissors;
            case 3 -> Shapes.Paper;
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
    }

    @Override
    public TypePlayer typePlayer() {
        return TypePlayer.IA;
    }

    @Override
    public String getName() {
        return "Computer Player";
    }
}
