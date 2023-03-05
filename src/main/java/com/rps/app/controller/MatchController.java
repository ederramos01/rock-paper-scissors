package com.rps.app.controller;

import com.rps.app.controller.player.ComputerPlayerController;
import com.rps.app.controller.player.HumanPlayerController;
import com.rps.app.controller.player.PlayerController;
import com.rps.app.controller.player.PlayerFactory;
import com.rps.app.model.MatchModel;
import com.rps.app.model.player.PlayerModel;
import com.rps.app.model.player.PlayerType;
import com.rps.app.view.MatchView;

public class MatchController {
    
    private MatchView matchview;
    private MatchModel matchModel;
    private MatchController matchController;
    private PlayerController[] playersController;
    private RoundController roundController;

    public MatchController(MatchModel matchModel) {
        this.matchModel = matchModel;
        this.matchview = new MatchView();
        this.playersController = new PlayerController[2];
        this.roundController = new RoundController();
        
    }

    public void setupGame() {
        PlayerType[] listPlayerToCreate = matchview.displayMatchMenu();
        
        playersController = PlayerFactory.CreatePlayer(playersController, listPlayerToCreate);

        playersController[0].getNewGamePlayer();
        playersController[1].getNewGamePlayer();
        matchModel.newMatch(new PlayerModel[]{playersController[0].getPlayer(), playersController[1].getPlayer()});
        roundController.setScore(matchModel.getScore());
        roundController.setPlayerController(playersController);
        runGame();
    }

    public void runGame() {
        roundController.setupNewRound();
        finishGame();
    }
    
    public void finishGame() {
        matchModel.addRoundsList(roundController.getRounds());
        announceWinnerOfTheMatch();
    }

    public void announceWinnerOfTheMatch() {
        matchModel.setWinner(roundController.getLastWinner());
        matchview.announceWinnerOfTheMatch(matchModel.getWinner());
    }
}
