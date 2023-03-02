package com.rps.app.view;

import com.rps.app.model.MatchModel;
import com.rps.app.model.player.PlayerModel;
import com.rpsgame.app.game.util.Console;

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

    //pasar por parametro el controller del jugador ganador
    public void announceWinnerOfTheMatch(PlayerModel winner) {
        System.out.println("KUDOS!! THE WINNER IS: " + winner.getName());
    }
}
