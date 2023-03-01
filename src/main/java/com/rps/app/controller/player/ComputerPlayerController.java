package com.rps.app.controller.player;

import com.rps.app.model.player.PlayerType;
import com.rps.app.utils.Shape;
import com.rps.app.view.player.ComputerPlayerView;
import com.rps.app.view.player.PlayerView;

public class ComputerPlayerController extends PlayerController {

    @Override
    protected PlayerView initPlayerView() {
        return new ComputerPlayerView();
    }

    @Override
    protected PlayerType initPlayerType() {
        return PlayerType.IA;
    }

    @Override
    public Shape selectShape() {
        return playerView.selectShape();
    }
    
}
