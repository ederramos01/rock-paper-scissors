package com.rpsgame.app;

import java.util.ArrayList;

public class RpsGame {

    Match myMatch;

    public void ExecuteGame() {
        int menuOption1 = 0;
        int menuOPtion2 = 0;
        boolean isValidOption = true;
        System.out.println(getMessage(1));

        while (menuOption1 == 0 || menuOption1 >= 3) {

            System.out.println("#1. PLAY");
            System.out.println("#2. QUIT");
            System.out.println("#");
            
            menuOption1 = Console.getInt("#SELECT AN OPTION: ");

            if (menuOption1 == 1) {
                System.out.println(getMessage(2));
                do {
                    isValidOption = true;
                    menuOPtion2 = Console.getInt("#SELECT AN OPTION: ");
                    if (menuOPtion2 > 3) {
                        isValidOption = false;
                    }
                } while (!isValidOption);
                myMatch = createMatch(createPlayers(menuOPtion2));
            }
            if (menuOption1 == 2) {
                exitGame();
            }
        }
    }

    public void exitGame() {
        System.out.println("Exiting the game... bye bye!");
    }

    public Match createMatch(ArrayList<Player> players){
        System.out.println("Match created");
        return new Match(players);
    }

    public ArrayList<Player> createPlayers(int option) {
        ArrayList<Player> myPlayers = new ArrayList<Player>();
        switch (option) {
            case 1 -> {
                Player p1 = new HumanPlayer();
                myPlayers.add(p1);
                Player p2 = new HumanPlayer();
                myPlayers.add(p2);
            }
            case 2 -> {
                Player p1 = new HumanPlayer();
                myPlayers.add(p1);
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
        myPlayers.forEach(System.out::println);
        return myPlayers;
    }

    public String getMessage(int option) {
        return switch (option) {
            case 1 -> "#Welcome to Rock, Scissors, Paper!!!\n" +
                    "#THIS IS A GAME WHERE YOU PICK A WEAPON AND FIGHT AGAINST\n" +
                    "#YOUR OPPONENT. YOU WIN WHEN YOU REACH 3 POINTS FIRST!!!\n" +
                    "#MENU:\n#";
            case 2 -> "# SETUP YOUR GAME BY CHOOSING YOUR PLAYERS:\n" +
                    "#\n" +
                    "#1. HUMAN VS HUMAN\n" +
                    "#2. HUMAN VS PC\n" +
                    "#3. PC VS PC";
            default -> "";
        };
    }
}
