package com.partgame.controller;

import java.util.ArrayList;

import com.partgame.view.PlayerView;
import com.partgame.view.RpsGameView;

public class RpsGameController {

    MatchController myMatch;
    RpsGameView rpsGameView = new RpsGameView();
    PlayerView playerView = new PlayerView();
    
    public void ExecuteGame() {
       
        int flagOption = rpsGameView.showMainMenu();
        if(flagOption != 0) {
            myMatch = createMatch(createPlayers(flagOption));
        }

    }

    public MatchController createMatch(ArrayList<PlayerController> players){
        System.out.println("Match created");
        return new MatchController(players);
    }
    
    public ArrayList<PlayerController> createPlayers(int flagOption) {
        return playerView.playersMenu(flagOption);
    }

    
}