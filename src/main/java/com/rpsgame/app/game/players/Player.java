package com.rpsgame.app.game.players;

public abstract class Player {

    protected int id_player;
    protected String name;
    protected TypePlayer id_typePlayer;

    public abstract Shapes chooseAShape();

    public abstract TypePlayer typePlayer();
}
