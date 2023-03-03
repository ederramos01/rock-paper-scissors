package com.rps.app.controller;

import com.rps.app.controller.player.ComputerPlayerController;
import com.rps.app.controller.player.HumanPlayerController;
import com.rps.app.controller.player.PlayerController;
import com.rps.app.model.MatchModel;
import com.rps.app.model.player.PlayerModel;
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
        int flagOption = matchController.showMatchMenu();

        switch(flagOption) {
            case 1 -> {
                System.out.println("option received " + flagOption);
                playersController[0] = new HumanPlayerController();
                playersController[1] = new HumanPlayerController();
            }
            case 2 -> {
                playersController[0] = new HumanPlayerController();
                playersController[1] = new ComputerPlayerController();
            }
            case 3 -> {
                playersController[0] = new ComputerPlayerController();
                playersController[1] = new ComputerPlayerController();
            }
        }

        playersController[0].getNewGamePlayer();
        playersController[1].getNewGamePlayer();
        matchModel.newMatch(new PlayerModel[]{playersController[0].getPlayer(), playersController[1].getPlayer()});
        roundController.setScore(matchModel.getScore());
        roundController.setPlayerController(playersController);
    }



    public int showMatchMenu() {
        return matchview.displayMatchMenu();
    }

    
    public void announceWinnerOfTheMatch(PlayerModel winner) {
        matchview.announceWinnerOfTheMatch(winner);
    }
}
