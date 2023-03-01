package com.rps.app.controller;

import com.rps.app.controller.player.ComputerPlayerController;
import com.rps.app.controller.player.HumanPlayerController;
import com.rps.app.controller.player.PlayerController;
import com.rps.app.model.MatchModel;
import com.rps.app.model.player.PlayerModel;
import com.rps.app.view.MatchView;
import com.rps.app.view.RPSGameView;

public class RPSController {
    
    private MatchModel matchModel;
    private RPSGameView rpsGameView;
    private MatchController matchController;
    private PlayerController[] playersController;
    private RoundController roundController;
    private ScoreController scoreController;

    public RPSController(MatchModel matchModel) {
        this.matchModel = matchModel;
        this.rpsGameView = new RPSGameView();
        this.matchController = new MatchController();
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
        //1. proceder a crear a los jugadores
        switch(flagOption) {
            case 1 -> {
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
        matchModel.newMatch(new PlayerModel[]{playersController[0].getPlayer(), playersController[1].getPlayer()});
    }

    public void initGame(){
        // comienzo el juego; comienzo a ejecutar la primera ronda;


    }

    // public MatchController createMatch(ArrayList<PlayerController> players){
    //     System.out.println("Match created");
    //     return new MatchController(players);
    // }
}
