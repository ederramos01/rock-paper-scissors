package com.rpsmvc.app.controller;

import com.rpsmvc.app.model.PlayerModel;
import com.rpsmvc.app.model.ShapesModel;
import com.rpsmvc.app.model.TypePlayerModel;

public abstract class PlayerController {
    
    protected PlayerModel playerModel;
    protected String name;
    protected TypePlayerModel id_typePlayer;

    public abstract String getName();

    public abstract ShapesModel chooseAShape();

    public abstract TypePlayerModel typePlayer();

    public PlayerModel getPlayer() {
        return this.playerModel;
    }
}
