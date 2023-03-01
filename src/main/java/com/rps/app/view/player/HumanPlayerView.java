package com.rps.app.view.player;

import com.rps.app.utils.Console;
import com.rps.app.utils.Shape;

public class HumanPlayerView extends PlayerView {

    @Override
    public String getName(String message) {
        return Console.readString(message);
    }

    @Override
    public Shape selectShape() {
        int option = Console.getInt("#SELECT AN OPTION: ");
        return switch (option){
            case 1 -> Shape.Rock;
            case 2 -> Shape.Scissors;
            case 3 -> Shape.Paper;
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
    }
    
}
