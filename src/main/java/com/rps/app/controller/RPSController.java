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

    // preguntarme cual es el resultado que espero de este metodo?
    // 1. mando a llamar a un metodo de una dependencia del tipo vista de este controller
    // 2. ese metodo devuelve un entero y llama a distintos metodos dependiendo de su valor
    // ya sea un metodo dentro de este controller o de la misma dependencia tipo vista
    public void play() {
        int flagOption = rpsGameView.showMainMenu();
        if(flagOption != 0) {
            setupGame();
        }
        if(flagOption == 0) {
            rpsGameView.showExitGame();
        }
    }

    // 1. obtengo un entero de llamar al metodo de un controlador de esta clase
    // 2. con esa opcion creo 2 controllers del tipo playerController dentro de un
    // arreglo de esta clase
    // 3. una dependencia controller crea un modelo de si mismo
    // 4. la dependencia modelo local introduce datos 
    // 5. una dependencia controller introduce un dato a su modelo y otro dato 
    //    del tipo Controller dentro si.
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

    // 1. una dependencia controlador ejecuta un metodo hasta que termine
    // 2. el modelo local introduce un dato del metodo del controlador anterior
    public void initGame(){
        roundController.executeRounds();
        matchModel.setWinner(roundController.getLastWinner());
    }

    // un controlador llama a un metodo de si mismo y se le pasa un dato del modelo local,
    // un dato que, a traves de un parametro del modelo del controlador, para acceder
    // a otro controlador y obtener su respectivo modelo.
    public void announceWinnerOfTheMatch() {
        matchController.announceWinnerOfTheMatch(matchModel.getWinner());
    }
}
