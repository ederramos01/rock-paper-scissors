package com.rps.app.controller;

import com.rps.app.controller.player.ComputerPlayerController;
import com.rps.app.controller.player.HumanPlayerController;
import com.rps.app.controller.player.PlayerController;
import com.rps.app.model.MatchModel;
import com.rps.app.model.player.PlayerModel;
import com.rps.app.view.RPSGameView;

public class RPSController {
    
    private MatchModel matchModel;
    private RPSGameView rpsGameView;
    private MatchController matchController;
    private PlayerController[] playersController;
    private RoundController roundController;

    public RPSController(MatchModel matchModel) {
        this.matchModel = matchModel;
        this.rpsGameView = new RPSGameView();
        this.playersController = new PlayerController[2];
        this.matchController = new MatchController();
        this.roundController = new RoundController();
    }

    public void play() {
        int flagOption = rpsGameView.showMainMenu();
        if(flagOption != 0) {
            setupGame();
        }
        if(flagOption == 0) {
            rpsGameView.showExitGame();
        }
    }

    public void setupGame() {
        int flagOption = matchController.showMatchMenu();

        switch(flagOption) {
            case 1 -> {
                System.out.println("option recibida " + flagOption);
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

    public void initGame(){
        roundController.executeRounds();
        matchModel.setWinner(roundController.getLastWinner());
    }

    public void announceWinnerOfTheMatch() {
        // pasar por parametro el controlador del jugador ganador
        // se puede conocer por el modelo general de MatchModel
        // debo buscar de donde extraer el jugador ganador
        //roundController.getWinnerOfTheMatch();
        matchController.announceWinnerOfTheMatch(matchModel.getWinner());
    }
}
