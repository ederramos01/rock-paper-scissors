package com.rpsmvc.app;

import com.rpsmvc.app.controller.RpsGameController;

public class RPSGameApp {
    private RpsGameController rpsGameController;

    public RPSGameApp() {
        this.rpsGameController = new RpsGameController();
    }

    public void runGame() {
        rpsGameController.ExecuteGame();
    }
    
}
