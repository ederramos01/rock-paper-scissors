package com.rps.app.model;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.rps.app.model.player.PlayerModel;
import com.rps.app.utils.Shape;

public class RoundModelTest {

    RoundModel roundModel = new RoundModel(0);
    PlayerModel playerModel = new PlayerModel("player1");

    @Test
    void getRoundNumberTest() {
        assertEquals(0, roundModel.getRoundNumber());
    }

    @Test
    void setPlayerShapeTest() {
        roundModel.setPlayer1Shape(Shape.Paper);
        assertEquals("Paper", roundModel.getPlayer1Shape().toString());
    }

    @Test
    void testSetWinnerOfThisRound() {
        roundModel.setWinnerOfThisRound(playerModel);
        assertSame(playerModel, roundModel.getWinner());
    }
}
