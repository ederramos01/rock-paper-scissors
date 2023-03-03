package com.rps.app.view;

import com.rps.app.model.player.PlayerModel;
import com.rps.app.utils.Console;

public class MatchView {

    public int displayMatchMenu() {
        int menuOption = 0;
        System.out.println("# SETUP YOUR GAME BY CHOOSING YOUR PLAYERS:\n" +
                "#\n" +
                "#1. HUMAN VS HUMAN\n" +
                "#2. HUMAN VS PC\n" +
                "#3. PC VS PC");
        while (menuOption < 1 || menuOption >= 4) {
            System.out.print("\tYour option: ");
            menuOption = Console.getInt();
        }
        return menuOption;
    }

    public void announceWinnerOfTheMatch(PlayerModel winner) {
        System.out.println("KUDOS!! THE WINNER IS: " + winner.getName());
    }
}
