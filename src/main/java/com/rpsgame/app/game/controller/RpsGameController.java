package com.rpsgame.app.game.controller;

import java.util.ArrayList;

import com.rpsgame.app.game.view.PlayerView;
import com.rpsgame.app.game.view.RpsGameView;

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