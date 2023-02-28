package com.rps.app.controller;

import com.rps.app.model.Match;
import com.rps.app.view.MatchView;
import com.rps.app.view.RPSGameView;

public class RPSController extends Controller{
    
    private Match matchModel;
    private RPSGameView rpsGameView;

    public RPSController(Match matchModel) {
        this.matchModel = matchModel;
        this.rpsGameView = rpsGameView;
    }

    public void setupGame() {
        rpsGameView.displayMainMenu();
        
        // crear new Match cuando ya tenga los jugadores creados
    }


    public void processMainMenuChoice(int choice) {
        switch (choice) {
            case 1 -> {
                rpsGameView.displayMatchMenu();
            }
            case 2 -> {
                System.exit(0);
            }
            default -> {
                System.out.println("Invalid choice!");
            }
        }
    }
}
