package com.rpsgame.app.game;

import com.rpsgame.app.game.controller.RpsGameController;

public class RPSGameApp {
    private RpsGameController rpsGameController;

    public RPSGameApp() {
        this.rpsGameController = new RpsGameController();
    }

    public void runGame() {
        rpsGameController.ExecuteGame();
    }
    
}
