package com.rps.app.controller;

import com.rps.app.controller.player.PlayerController;
import com.rps.app.model.MatchModel;
import com.rps.app.view.MatchView;
import com.rps.app.view.RPSGameView;

public class RPSController {
    
    private MatchModel matchModel;
    private RPSGameView rpsGameView;
    private MatchController matchController;
    private PlayerController[] playersController;


    public RPSController(MatchModel matchModel) {
        this.matchModel = matchModel;
        this.rpsGameView = new RPSGameView();
        //aqui se crean los controllers restantes
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
                
            }
            case 2 -> {}
            case 3 -> {}
        }

        //instanciar controladores de tipos de jugadores y dentro de ellos crear los jugadores y guardar modelos
        //2. insertar esoso modelos de jugadores al modelo Match
        
        // crear new Match cuando ya tenga los jugadores creados
        //myMatch = createMatch(createPlayers(flagOption));
    }

    public void initGame(){

    }

    public MatchController createMatch(ArrayList<PlayerController> players){
        System.out.println("Match created");
        return new MatchController(players);
    }
}
