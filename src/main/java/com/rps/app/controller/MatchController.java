package com.rps.app.controller;

import com.rps.app.model.MatchModel;
import com.rps.app.view.MatchView;

public class MatchController extends Controller {
    
    private MatchModel matchModel;
    private MatchView view;
    

    public MatchController(MatchModel matchModel, MatchView view) {
        this.matchModel = matchModel;
        this.view = view;
    }

    public void processMatchMenuChoice(int choice) {
        switch (choice) {
            case 1 -> 
        }
    }

}
