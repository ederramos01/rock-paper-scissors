package com.rps.app;

import com.rps.app.controller.RPSController;
import com.rps.app.model.RPSGame;

public class RockScissorsPaperApp {
    
    private RPSGame game;
    private RPSController rpsController;

    public RockScissorsPaperApp() {
        game = new RPSGame();
        rpsController = new RPSController(game.getMatch());
    }

    public void runGame() {
        rpsController.play();
        rpsController.initGame();
        rpsController.showResults();
    }
}
