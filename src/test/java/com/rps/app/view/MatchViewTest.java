package com.rps.app.view;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.rps.app.model.player.PlayerModel;

public class MatchViewTest {
    @Test
    public void announceWinnerOfTheMatchTest() {
        MatchView matchView = mock(MatchView.class);
        PlayerModel playerModel = mock(PlayerModel.class);
        
        matchView.announceWinnerOfTheMatch(playerModel);
        verify(matchView, times(1)).announceWinnerOfTheMatch(playerModel);
    }
}
