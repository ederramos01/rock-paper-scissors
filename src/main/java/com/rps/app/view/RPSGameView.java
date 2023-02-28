package com.rps.app.view;
import com.rps.app.utils.Console;

import com.rps.app.controller.RPSController;

public class RPSGameView {

    public void displayMainMenu() {
        String welcomeMessage = "#Welcome to Rock - Scissors - Paper!!!\n" +
        "#THIS IS A GAME WHERE YOU PICK A WEAPON AND FIGHT AGAINST\n" +
        "#YOUR OPPONENT. YOU WIN WHEN YOU REACH 3 POINTS FIRST!!!\n" +
        "#MENU:\n#";
        Console.printLine(welcomeMessage);
        Console.printLine("#1. PLAY\n#2. QUIT\n#");
        int menuOption1 = 0;
        while(menuOption1 < 1 || menuOption1 > 2) {
            System.out.print("\tYour option: ");
            menuOption1 = Console.readInt(null);
        };
        rpsGameController.processMainMenuChoice(menuOption1);
    }

    public 
}
