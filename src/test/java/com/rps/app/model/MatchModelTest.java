package com.rps.app.model;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.rps.app.controller.player.HumanPlayerController;
import com.rps.app.controller.player.PlayerController;

public class MatchModelTest {
    @Test
    void testNewMatch() {
        PlayerController[] playerController = {new HumanPlayerController(), new HumanPlayerController()};
        MatchModel matchModel = mock(MatchModel.class);

        // matchModel.newMatch(playerController);
    }
}
