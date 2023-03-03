package com.rps.app.view;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.rps.app.model.player.PlayerModel;

public class MatchViewTest {

    @Test
    public void newTest() {
        MatchView matchView = mock(MatchView.class);

        when(matchView.displayMatchMenu()).thenReturn(1);
        
        assertEquals(1, matchView.displayMatchMenu());
        // matchView.displayMatchMenu();
        // verify(matchView, times(1)).displayMatchMenu();

    }

    @Test
    public void announceWinnerOfTheMatchTest() {
        MatchView matchView = mock(MatchView.class);
        PlayerModel playerModel = mock(PlayerModel.class);
        
        matchView.announceWinnerOfTheMatch(playerModel);
        verify(matchView, times(1)).announceWinnerOfTheMatch(playerModel);
    }
}
