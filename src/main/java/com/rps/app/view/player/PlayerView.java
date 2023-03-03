package com.rps.app.view.player;

import com.rps.app.model.player.PlayerModel;
import com.rps.app.utils.Shape;

public abstract class PlayerView {

    public PlayerModel getPlayer() {
        String name = "";
        do {
            name = getName("Name for this player: ");
            name = name.trim();
        } while (name.length()==0);
        return new PlayerModel(name);
    }

    public abstract String getName(String message);

    public abstract Shape selectShape();
}
