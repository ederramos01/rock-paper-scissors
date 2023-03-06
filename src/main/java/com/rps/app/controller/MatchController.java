package com.rps.app.controller;

import com.rps.app.controller.player.PlayerController;
import com.rps.app.controller.player.playersFactory.PlayerFactory;
import com.rps.app.model.MatchModel;
import com.rps.app.model.player.PlayerModel;
import com.rps.app.model.player.PlayerType;
import com.rps.app.view.MatchView;

public class MatchController {
    
    private MatchView matchview;
    private MatchModel matchModel;
    private PlayerController[] playersController;
    private RoundController roundController;

    public MatchController(MatchModel matchModel) {
        this.matchModel = matchModel;
        this.matchview = new MatchView();
        this.playersController = new PlayerController[2];
        this.roundController = new RoundController();
    }

    public void setupGame() {
        PlayerType[] playersList = matchview.displayMatchMenu();
        // procede a crear los tipos de controladores para jugadores elegidos
        PlayerFactory.CreatePlayer(playersController, playersList);
        getPlayersForNewMatch();
        // esta linea se puede automatizar
        matchModel.newMatch(new PlayerModel[]{playersController[0].getPlayer(), playersController[1].getPlayer()});
        roundController.setScore(matchModel.getScore());
        roundController.setPlayerController(playersController);
        runGame();
    }

    private void getPlayersForNewMatch() {
        int i = 1;
        for (PlayerController playerController : playersController) {
            playerController.getNewGamePlayer(i);
            i++;
        }
    }

    private void runGame() {
        roundController.setupNewRound();
        finishGame();
    }
    
    private void finishGame() {
        matchModel.addRoundsList(roundController.getRounds());
        announceWinnerOfTheMatch();
    }

    private void announceWinnerOfTheMatch() {
        matchModel.setWinner(roundController.getLastWinner());
        matchview.announceWinnerOfTheMatch(matchModel.getWinner());
    }
}
