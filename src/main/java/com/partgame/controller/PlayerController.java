package com.partgame.controller;

import com.partgame.model.ShapesModel;
import com.partgame.model.TypePlayerModel;

public abstract class PlayerController {

    protected String name;
    protected TypePlayerModel id_typePlayer;

    public abstract String getName();

    public abstract ShapesModel chooseAShape();

    public abstract TypePlayerModel typePlayer();
}
