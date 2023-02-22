package com.rps.app.model;

import com.rpsgame.app.game.players.TypePlayer;

public class PlayerModel {

    private int id_player;
    private String name;
    private TypePlayer id_typePlayer;
    
    public int getId_player() {
        return id_player;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypePlayer getId_typePlayer() {
        return id_typePlayer;
    }

    public void setId_typePlayer(TypePlayer id_typePlayer) {
        this.id_typePlayer = id_typePlayer;
    }
}
