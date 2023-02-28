package com.rps.app.controller;

import java.util.ArrayList;

import com.rps.app.view.RPSGameView;

public class Controller {
    
    RPSController rpsGameController;
    MatchController matchController;
    RPSGameView view;

    ArrayList<Controller> myControllers;

    public Controller() {
        myControllers = new ArrayList<>();
        this.view = new RPSGameView(rpsGameController);
        //this.rpsGameController = new RPSGameController(null, null)
    }

    public void addControllers() {
        myControllers.add(rpsGameController);
        myControllers.add(matchController);
    }

    public void ExecuteGame() {
        view.displayMainMenu();
    }
}
