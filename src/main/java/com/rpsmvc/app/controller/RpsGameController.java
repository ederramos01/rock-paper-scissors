package com.rpsmvc.app.controller;

import java.util.ArrayList;

import com.rpsmvc.app.model.MatchModel;
import com.rpsmvc.app.model.PlayerModel;
import com.rpsmvc.app.view.PlayerView;
import com.rpsmvc.app.view.RpsGameView;

public class RpsGameController {

    MatchModel matchModel;
    MatchController myMatch;

    RpsGameView rpsGameView = new RpsGameView();
    PlayerView playerView = new PlayerView();
    
    ArrayList<PlayerController> myPlayers;
    
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
        myPlayers = playerView.playersMenu(flagOption);
        // matchModel.setPlayers(new PlayerModel(myPlayers.get(0)));
        return playerView.playersMenu(flagOption);
    }

    
}