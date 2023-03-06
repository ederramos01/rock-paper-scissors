package com.rps.app.view;

import com.rps.app.utils.Console;

public class AppView {

    public int showMainMenu() {
        int menuOption1 = 0;
        int flagToSend = 1;

        Console.printTitle(getMessage());
        System.out.println("#");
        System.err.println("# Menu:");
        System.out.println("# 1. Start Playing");
        System.out.println("# 2. QUIT");
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
        System.out.println("Exiting game... bye bye!");
    }

    public String getMessage() {
        String welcomeMessage = "#Welcome to Rock, Scissors, Paper!!!\n" +
                "#THIS IS A GAME WHERE YOU CAN PICK A WEAPON AND FIGHT\n" +
                "#AGAINST YOUR OPPONENT. YOU WIN WHEN YOU REACH 3 POINTS FIRST!!!";

        return welcomeMessage;
    }
}
