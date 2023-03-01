package com.partgame.view;

import com.rpsgame.app.game.util.Console;

public class RpsGameView {
    
    public int showMainMenu() {
        int menuOption1 = 0;
        int menuOPtion2 = 0;
        int flagToSend = 0;

        getMessages(1);
        System.out.println("#1. PLAY");
        System.out.println("#2. QUIT");
        System.out.println("#");

        while (menuOption1 < 1 || menuOption1 > 3) {
            System.out.print("\tYour option: ");
            menuOption1 = Console.getInt();
        }

        if (menuOption1 == 1) {
            getMessages(2);
            while (menuOPtion2 < 1 || menuOPtion2 > 3) {
                System.out.print("\tYour option: ");
                menuOPtion2 = Console.getInt();
            }
            //aqui iba el menu para mymatch
            flagToSend = menuOPtion2;
        }
        if (menuOption1 == 2) {
            flagToSend = 0;
        }
        return flagToSend;
    }

    public void getMessages(int option) {
        switch (option) {
            case 1 -> System.out.println("#Welcome to Rock, Scissors, Paper!!!\n" +
                "#THIS IS A GAME WHERE YOU PICK A WEAPON AND FIGHT AGAINST\n" +
                "#YOUR OPPONENT. YOU WIN WHEN YOU REACH 3 POINTS FIRST!!!\n" +
                "#MENU:\n#");
            case 2 -> System.out.println("# SETUP YOUR GAME BY CHOOSING YOUR PLAYERS:\n" +
                "#\n" +
                "#1. HUMAN VS HUMAN\n" +
                "#2. HUMAN VS PC\n" +
                "#3. PC VS PC");
            default -> System.out.println("");
        };
    }
}
