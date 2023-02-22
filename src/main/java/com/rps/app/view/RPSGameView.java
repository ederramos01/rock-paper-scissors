package com.rps.app.view;

import com.rps.app.controller.RPSGameController;
import com.rpsgame.app.game.util.Console;

public class RPSGameView {
    
    private RPSGameController rpsGameController;

    public RPSGameView(RPSGameController rpsGameController) {
        this.rpsGameController = rpsGameController;
    }

    public void displayMainMenu() {
        System.out.println("#Welcome to Rock - Scissors - Paper!!!\n" +
            "#THIS IS A GAME WHERE YOU PICK A WEAPON AND FIGHT AGAINST\n" +
            "#YOUR OPPONENT. YOU WIN WHEN YOU REACH 3 POINTS FIRST!!!\n" +
            "#MENU:\n#");
        System.out.println("#1. PLAY");
        System.out.println("#2. QUIT");
        System.out.println("#");
        System.out.print("\tYour option: ");
        int menuOption1 = Console.getInt();
        rpsGameController.processMainMenuChoice(menuOption1);
    }
}
