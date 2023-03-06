package com.rps.app.view.player;

import com.rps.app.model.player.PlayerModel;
import com.rps.app.utils.Shape;

public abstract class PlayerView {

    public PlayerModel getPlayer(int i) {
        String name = "";
        do {
            name = getName("Name for player " + i + ": ");
            name = name.trim();
        } while (name.length()==0);
        return new PlayerModel(name);
    }

    public abstract String getName(String message);

    public abstract Shape selectShape();
}
