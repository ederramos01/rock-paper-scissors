package com.rps.app.view;

import com.rps.app.controller.MatchController;
import com.rpsgame.app.game.util.Console;

public class MatchView {

    private MatchController matchController;

    public MatchView(MatchController matchController) {
        this.matchController = matchController;
    }

    public void displayMatchMenu() {
        System.out.println("# SETUP YOUR GAME BY CHOOSING YOUR PLAYERS:\n" +
            "#\n" +
            "#1. HUMAN VS HUMAN\n" +
            "#2. HUMAN VS PC\n" +
            "#3. PC VS PC");
            System.out.print("\tYour option: ");
            int menuOption2 = Console.getInt();
            matchController.processMatchMenuChoice(menuOption2);
    }

    //
    
}
