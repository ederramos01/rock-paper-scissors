package com.rpsmvc.app.view;

import java.util.ArrayList;

import com.rpsmvc.app.controller.PlayerController;
import com.rpsmvc.app.controller.players.ComputerPlayerController;
import com.rpsmvc.app.controller.players.HumanPlayerController;
import com.rpsmvc.app.util.Console;

public class PlayerView {
    
    public ArrayList<PlayerController> playersMenu(int option) {

        String name;
        ArrayList<PlayerController> myPlayers = new ArrayList<PlayerController>();
        switch (option) {
            case 1 -> {
                name = Console.getString("Enter a name for player1: ");
                myPlayers.add(setHumanPlayer(name));
                name = Console.getString("Enter a name for player2: ");
                myPlayers.add(setHumanPlayer(name));
            }
            case 2 -> {
                name = Console.getString("Enter a name for player1: ");
                myPlayers.add(setHumanPlayer(name));
                PlayerController p2 = new ComputerPlayerController();
                myPlayers.add(p2);
            }
            case 3 -> {
                PlayerController p1 = new ComputerPlayerController();
                myPlayers.add(p1);
                PlayerController p2 = new ComputerPlayerController();
                myPlayers.add(p2);
            }
            case 0 -> {
                exitGame();
            }
        }
        System.out.println("Players created");
        return myPlayers;
    }

    private PlayerController setHumanPlayer(String name) {
        return new HumanPlayerController(name);
    }

    public void exitGame() {
        System.out.println("Exiting the game... bye bye!");
    }

}
