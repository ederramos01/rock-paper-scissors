package com.rpsgame.app.game.model;

import java.util.ArrayList;
import java.util.List;

import com.rpsgame.app.game.controller.ShapesController;

public class RoundModel {
    private static int idRound = 0;
    private List<ShapesController> shape1 = new ArrayList<>();
    private List<ShapesController> shape2 = new ArrayList<>();

    public RoundModel() {
        RoundModel.idRound++;
    }

    public void setShape1(ShapesController shape1) {
        this.shape1.add(shape1);
    }

    public void setShape2(ShapesController shape2) {
        this.shape2.add(shape2);
    }

    @Override
    public String toString() {
        return "RoundModel [round="+ idRound + ", Player1 " + shape1 + ", Player2=" + shape2 + "]";
    }

}
