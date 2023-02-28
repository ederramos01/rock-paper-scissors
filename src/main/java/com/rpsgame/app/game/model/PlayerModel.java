package com.rpsgame.app.game.model;

import com.rpsgame.app.game.controller.TypePlayerController;

public class PlayerModel {

    private int id_player;
    private String name;
    private TypePlayerController id_typePlayer;

    public PlayerModel(int id_player, String name, TypePlayerController id_typePlayer) {
        this.id_player = id_player;
        this.name = name;
        this.id_typePlayer = id_typePlayer;
    }

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

    public TypePlayerController getId_typePlayer() {
        return id_typePlayer;
    }

    public void setId_typePlayer(TypePlayerController id_typePlayer) {
        this.id_typePlayer = id_typePlayer;
    }

    @Override
    public String toString() {
        return "PlayerModel - Player " + name + ", with ID " + id_player + ", the type player is " + id_typePlayer;
    }

    
}
