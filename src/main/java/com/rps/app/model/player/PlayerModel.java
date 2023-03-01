package com.rps.app.model.player;

public class PlayerModel {

    private String name;
    private PlayerType playerType;

    public PlayerModel(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + " which is " + playerType + " ]";
    }

}
