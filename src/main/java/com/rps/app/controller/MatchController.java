package com.rps.app.controller;

import com.rps.app.view.MatchView;

public class MatchController {
    
    //private MatchModel matchModel;
    private MatchView matchview;
    

    public MatchController() {
        this.matchview = new MatchView();
    }

    public int showMatchMenu() {
        return matchview.displayMatchMenu();
    }

    //pasar por parametro el controller del jugador ganador
    public void announceWinnerOfTheMatch() {
        matchview.announceWinnerOfTheMatch();
    }
}
