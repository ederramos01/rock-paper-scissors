package com.rps.app.controller.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.rps.app.model.player.PlayerModel;
import com.rps.app.model.player.PlayerType;

public class PlayerControllerTest {
    
    PlayerController playerController = new HumanPlayerController();
    PlayerModel playerModel = new PlayerModel("Player1");
    
    @Test
    void testCreationPlayer() {
        playerController.playerModel = playerModel;
        playerController.playerModel.setPlayerType(PlayerType.HUMANPLAYER);
        assertEquals(PlayerType.HUMANPLAYER, playerController.getPlayer().getPlayerType());
    }

    @Test
    void testGetNamePlayer() {
        playerController.playerModel = playerModel;
        assertEquals("Player1", playerController.getPlayer().getName());
    }
}
