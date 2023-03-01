package com.rpsgame.app.game.controller;

import java.util.ArrayList;

import com.rpsgame.app.game.model.MatchModel;
import com.rpsgame.app.game.model.PlayerModel;
import com.rpsgame.app.game.view.PlayerView;
import com.rpsgame.app.game.view.RpsGameView;

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