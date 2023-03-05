package com.rps.app.controller.player;

import com.rps.app.model.player.PlayerType;

public class PlayerFactory {
    public static PlayerController[] CreatePlayer(PlayerController[] playerControllers, PlayerType[] playerType){
        
        for (int i = 0; i < playerType.length; i++) {
            if(playerType[i].equals(PlayerType.HUMANPLAYER)) {
                playerControllers[i] = new HumanPlayerController();
            }
            if(playerType[i].equals(PlayerType.IA)) {
                playerControllers[i] = new ComputerPlayerController();
            }
        }
        return playerControllers;
    }
}
