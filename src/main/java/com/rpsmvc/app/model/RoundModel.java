package com.rpsmvc.app.model;

import java.util.ArrayList;
import java.util.List;

public class RoundModel {

    //Need to be static from the class where rpsgame calls.
    private int idRound;
    private List<ShapesModel> shape1 = new ArrayList<>();
    private List<ShapesModel> shape2 = new ArrayList<>();
    
    public RoundModel() {
        this.idRound = 0;
    }

    public void setShape1(ShapesModel shape1) {
        this.shape1.add(shape1);
    }

    public void setShape2(ShapesModel shape2) {
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
