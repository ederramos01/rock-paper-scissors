package com.rpsgame.app.game;

import java.util.ArrayList;

import com.rpsgame.app.game.players.ComputerPlayer;
import com.rpsgame.app.game.players.HumanPlayer;
import com.rpsgame.app.game.players.Player;
import com.rpsgame.app.game.util.Console;

public class RpsGame {

    Match myMatch;

    public void ExecuteGame() {
       
        int menuOption1 = 0;
        int menuOPtion2 = 0;

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
            myMatch = createMatch(createPlayers(menuOPtion2));
        }
        if (menuOption1 == 2) {
            exitGame();
        }
    }

    public Match createMatch(ArrayList<Player> players){
        System.out.println("Match created");
        return new Match(players);
    }
    
    public ArrayList<Player> createPlayers(int option) {
        String name;
        ArrayList<Player> myPlayers = new ArrayList<Player>();
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
                Player p2 = new ComputerPlayer();
                myPlayers.add(p2);
            }
            case 3 -> {
                Player p1 = new ComputerPlayer();
                myPlayers.add(p1);
                Player p2 = new ComputerPlayer();
                myPlayers.add(p2);
            }
        }
        System.out.println("Players created");
        return myPlayers;
    }

    private Player setHumanPlayer(String name) {
        return new HumanPlayer(name);
    }

    public void exitGame() {
        System.out.println("Exiting the game... bye bye!");
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
