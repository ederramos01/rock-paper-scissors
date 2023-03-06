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

    public void getNewGamePlayer() {
        this.playerModel = playerView.getPlayer();
        this.playerModel.setPlayerType(playerType);
    }

    public PlayerModel getPlayer() {
        return this.playerModel;
    }

    public String getName() {
        return playerModel.getName();
    }

    public abstract Shape selectShape();
}
