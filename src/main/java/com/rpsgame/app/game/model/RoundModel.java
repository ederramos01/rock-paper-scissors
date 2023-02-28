package com.rpsgame.app.game.model;

import java.util.ArrayList;
import java.util.List;

import com.rpsgame.app.game.controller.ShapesController;

public class RoundModel {
    private int idRound;
    private List<ShapesController> shape1 = new ArrayList<>();
    private List<ShapesController> shape2 = new ArrayList<>();

    public RoundModel() {
        this.idRound = 0;
    }

    public void setShape1(ShapesController shape1) {
        this.shape1.add(shape1);
    }

    public void setShape2(ShapesController shape2) {
        this.shape2.add(shape2);
    }    

    public void setIdRound(int idRound) {
        this.idRound = idRound;
    }

    @Override
    public String toString() {
        return "RoundModel "+ idRound + ", Player 1 chose " + shape1 + ", and Player 2 chose " + shape2;
    }

}
