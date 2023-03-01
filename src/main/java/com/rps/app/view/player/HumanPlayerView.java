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
        return 
    }
    
}
