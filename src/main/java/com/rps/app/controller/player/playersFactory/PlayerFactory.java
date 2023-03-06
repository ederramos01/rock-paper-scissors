package com.rps.app.controller.player.playersFactory;

import com.rps.app.controller.player.ComputerPlayerController;
import com.rps.app.controller.player.HumanPlayerController;
import com.rps.app.controller.player.PlayerController;
import com.rps.app.model.player.PlayerType;

public class PlayerFactory {

    //PlayerController[]
    public static void CreatePlayer(PlayerController[] playerControllers, PlayerType[] playerType){
        
        for (int i = 0; i < playerType.length; i++) {
            if(playerType[i].equals(PlayerType.HUMANPLAYER)) {
                playerControllers[i] = new HumanPlayerController();
            }
            if(playerType[i].equals(PlayerType.IA)) {
                playerControllers[i] = new ComputerPlayerController();
            }
        }
        //return playerControllers;
    }
    
}
