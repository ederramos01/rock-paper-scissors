package com.rps.app.view;

import com.rps.app.utils.Console;

public class RPSGameView {

    public int showMainMenu() {
        int menuOption1 = 0;
        int flagToSend = 1;

        getMessage();
        System.out.println("#1. PLAY");
        System.out.println("#2. QUIT");
        System.out.println("#");

        while (menuOption1 < 1 || menuOption1 > 3) {
            System.out.print("\tYour option: ");
            menuOption1 = Console.getInt();
        }
        if (menuOption1 == 2) {
            flagToSend = 0;
        }
        return flagToSend;
    }

    public void showExitGame() {
        System.out.println("Exiting the game... bye bye!");
    }

    public void getMessage() {
        System.out.println("#Welcome to Rock, Scissors, Paper!!!\n" +
                "#THIS IS A GAME WHERE YOU PICK A WEAPON AND FIGHT AGAINST\n" +
                "#YOUR OPPONENT. YOU WIN WHEN YOU REACH 3 POINTS FIRST!!!\n" +
                "#MENU:\n#");
    }
}
