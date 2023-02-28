package com.rpsgame.app.game.controller;

import com.rpsgame.app.game.model.ShapesModel;
import com.rpsgame.app.game.model.TypePlayerModel;

public abstract class PlayerController {

    protected String name;
    protected TypePlayerModel id_typePlayer;

    public abstract String getName();

    public abstract ShapesModel chooseAShape();

    public abstract TypePlayerModel typePlayer();
}
