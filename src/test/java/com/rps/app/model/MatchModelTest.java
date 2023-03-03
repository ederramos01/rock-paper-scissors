package com.rps.app.model;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.rps.app.model.player.PlayerModel;

public class MatchModelTest {

    PlayerModel[] playerModel = {new PlayerModel("player1"), new PlayerModel("Player2")};
    MatchModel matchModel = new MatchModel();
    RoundModel roundModel = mock(RoundModel.class);
    
    @Test
    void checkRoundListTest() {
        matchModel.newMatch(playerModel);
        matchModel.addRound(roundModel);
        matchModel.addRound(roundModel);

        assertEquals(2, matchModel.getRoundsList().size());
    }

    @Test
    void checkSetterGetterWinnerTest() {
        matchModel.setWinner(playerModel[0]);
        assertEquals("player1", matchModel.getWinner().getName());
    }
}
