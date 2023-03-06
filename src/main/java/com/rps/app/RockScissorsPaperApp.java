package com.rps.app;

import com.rps.app.controller.MatchController;
import com.rps.app.model.RPSGameModel;
import com.rps.app.view.AppView;

public class RockScissorsPaperApp {

    private RPSGameModel gameModel;
    private MatchController matchController;
    private AppView appView;

    public RockScissorsPaperApp() {
        this.gameModel = new RPSGameModel();
        this.appView = new AppView();
        this.matchController = new MatchController(gameModel.getMatch());
    }

    public void runGame() {
        int optionSelected = appView.showMainMenu();
        if (optionSelected != 0) {
            setupGame();
        }
        if (optionSelected == 0) {
            exit();
        }
    }

    public void setupGame() {
        matchController.setupGame();
    }

    public void exit() {
        appView.showExitGame();
    }
}
