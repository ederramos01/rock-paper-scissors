package com.rps.app;

import com.rps.app.controller.Controller;

public class App {
    public static void main( String[] args ){

        Controller mainController = new Controller();
        mainController.ExecuteGame();
    }
}
