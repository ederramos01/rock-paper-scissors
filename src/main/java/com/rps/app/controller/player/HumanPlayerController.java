package com.rps.app.controller.player;

import com.rps.app.model.player.PlayerType;
import com.rps.app.utils.Shape;
import com.rps.app.view.player.HumanPlayerView;
import com.rps.app.view.player.PlayerView;

public class HumanPlayerController extends PlayerController{

    // public HumanPlayerController() {
    //     super();   
    // }

    @Override
    protected PlayerView initPlayerView() {
        return new HumanPlayerView();
    }

    @Override
    protected PlayerType initPlayerType() {
        return PlayerType.HUMANPLAYER;
    }

    @Override
    public Shape selectShape() {
        return playerView.selectShape();
    }
    
}
