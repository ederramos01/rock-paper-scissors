package com.partgame;

import com.partgame.controller.RpsGameController;

public class RPSGameApp {
    private RpsGameController rpsGameController;

    public RPSGameApp() {
        this.rpsGameController = new RpsGameController();
    }

    public void runGame() {
        rpsGameController.ExecuteGame();
    }
    
}
