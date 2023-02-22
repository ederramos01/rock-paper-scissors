package com.rpsgame.app.game.controller;

public abstract class PlayerController {

    protected static int id_player = 0;
    protected String name;
    protected TypePlayerController id_typePlayer;

    public abstract String getName();

    public abstract ShapesController chooseAShape();

    public abstract TypePlayerController typePlayer();
}
