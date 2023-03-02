package com.rps.app.controller.player;

import com.rps.app.model.player.PlayerModel;
import com.rps.app.model.player.PlayerType;
import com.rps.app.utils.Shape;
import com.rps.app.view.player.PlayerView;


public abstract class PlayerController {
    
    protected PlayerModel playerModel;
    protected PlayerView playerView;
    protected PlayerType playerType;

    public PlayerController() {
        playerView = initPlayerView();
        playerType = initPlayerType();
    }

    protected abstract PlayerView initPlayerView();
    protected abstract PlayerType initPlayerType();

    // aqui se hace el set del modelo del jugador
    public void getNewGamePlayer() {
        this.playerModel = playerView.getPlayer();
        this.playerModel.setPlayerType(playerType);
    }

    // para devolver este modelo de jugador al modelo principal desde el controlador principal
    // este moetodo que sea abstracto 
    public PlayerModel getPlayer() {
        return this.playerModel;
    }

    // para mostrar el nombre del jugador durante las rondas
    // tambien puede ser abstracto
    public String getName() {
        return playerModel.getName();
    }

    public abstract Shape selectShape();
}
