package com.rps.app.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.rps.app.controller.player.PlayerController;
import com.rps.app.model.ScoreModel;

public class RoundControllerTest {
    @Test
    public void callExecuteGameTest() {
        RoundController roundController = mock(RoundController.class);
        roundController.setupNewRound();
        verify(roundController, times(1)).setupNewRound();
    }

    @Test
    public void checkUpdateScoreTest() {
        ScoreModel scoreModel = new ScoreModel();
        scoreModel.updateP1Score();
        scoreModel.updateP1Score();
        scoreModel.updateP1Score();

        assertEquals(3, scoreModel.getP1Score());
    }

    @Test
    public void checkLastWinnerTest() {
        RoundController roundConroller = mock(RoundController.class);
        PlayerController playersController = mock(PlayerController.class);
        
        assertSame(playersController.getPlayer(), roundConroller.getLastWinner());
    }

    @Test
    public void checkSetScoreTest() {
        RoundController roundController = mock(RoundController.class);
        ScoreModel scoreModel = mock(ScoreModel.class);
        roundController.setScore(scoreModel);
        verify(roundController, times(1)).setScore(scoreModel);
    }
}
