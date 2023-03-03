package com.rps.app.controller;

import com.rps.app.model.player.PlayerModel;
import com.rps.app.view.MatchView;

public class MatchController {
    
    private MatchView matchview;
    

    public MatchController() {
        this.matchview = new MatchView();
    }

    public int showMatchMenu() {
        return matchview.displayMatchMenu();
    }

    
    public void announceWinnerOfTheMatch(PlayerModel winner) {
        matchview.announceWinnerOfTheMatch(winner);
    }
}
