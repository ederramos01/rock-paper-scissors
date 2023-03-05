package com.rps.app.view;

import com.rps.app.model.player.PlayerModel;
import com.rps.app.model.player.PlayerType;
import com.rps.app.utils.Console;

public class MatchView {

    public PlayerType[] displayMatchMenu() {
        
        PlayerType[] listPlayers = new PlayerType[2];
        
        listPlayers[0] = assignTypeOfPlayer(1);
        listPlayers[1] = assignTypeOfPlayer(2);

        return listPlayers;
    }

    public PlayerType assignTypeOfPlayer(int numberOfPlayer) {
        int menuOption = 0;
        PlayerType playerType = null;
        System.out.println("# SETTING UP PLAYER "+ numberOfPlayer + ": " +
                "#\n" +
                "#1. HUMAN PLAYER\n" +
                "#2. PC PLAYER\n");
        while (menuOption < 1 || menuOption >= 3) {
            System.out.print("\tYour option: ");
            menuOption = Console.getInt();
        }
        if (menuOption == 1) {
            playerType = PlayerType.HUMANPLAYER;
        }
        if (menuOption == 2) {
            playerType = PlayerType.IA;
        }
        return playerType;
    }

    public void announceWinnerOfTheMatch(PlayerModel winner) {
        System.out.println("KUDOS!! THE WINNER IS: " + winner.getName());
    }
}

// public int displayMatchMenu() {
    //     int menuOption = 0;
    //     System.out.println("# SETUP YOUR GAME BY CHOOSING YOUR PLAYERS IN ORDER TO START PLAYING:\n" +
    //             "#\n" +
    //             "#1. HUMAN VS HUMAN\n" +
    //             "#2. HUMAN VS PC\n" +
    //             "#3. PC VS PC");
    //     while (menuOption < 1 || menuOption >= 4) {
    //         System.out.print("\tYour option: ");
    //         menuOption = Console.getInt();
    //     }
    //     return menuOption;
    // }