package com.rps.app.model.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

import org.junit.jupiter.api.Test;

public class PlayerModelTest {

    PlayerModel playerModel = new PlayerModel("Player1");

    @Test
    void testGetPlayerType() {
        assertEquals("Player1", playerModel.getName());
    }

    @Test
    void testPlayerType() {
        playerModel.setPlayerType(PlayerType.IA);
        assertEquals(PlayerType.IA, playerModel.getPlayerType());
    }
}
