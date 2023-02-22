package com.rps.app.controller;

import com.rps.app.model.GameModel;
import com.rps.app.view.MatchView;
import com.rps.app.view.RPSGameView;

public class RPSGameController extends Controller{
    
    private GameModel gameModel;
    private MatchView view;

    public RPSGameController(GameModel gameModel, MatchView view) {
        this.gameModel = gameModel;
        this.view = view;
    }

    public void processMainMenuChoice(int choice) {
        switch (choice) {
            case 1 -> {
                view.displayMatchMenu();
            }
            case 2 -> {
                System.exit(0);
            }
            default -> {
                System.out.println("Invalid choice!");
            }
        }
    }

    public void startNewMatch(){}
}
