package com.rpsmvc.app.model;

public class PlayerModel {
    
    private String name;
    private TypePlayerModel id_typePlayer;

    public PlayerModel(String name, TypePlayerModel id_typePlayer) {
        this.name = name;
        this.id_typePlayer = id_typePlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypePlayerModel getId_typePlayer() {
        return id_typePlayer;
    }

    public void setId_typePlayer(TypePlayerModel id_typePlayer) {
        this.id_typePlayer = id_typePlayer;
    }

    @Override
    public String toString() {
        return "PlayerModel - Player " + name + ", the type player is " + id_typePlayer;
    }

}
