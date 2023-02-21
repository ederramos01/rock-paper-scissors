package com.rpsgame.app.game;

import java.util.ArrayList;

import com.rpsgame.app.game.players.Player;
import com.rpsgame.app.game.players.Shapes;

public class Round {

    private int roundNumber;
    private Score score;

    //private static int p1Score;
    //private static int p2Score;

    private Player player1;
    private Player player2;


    public Round(Score score, int roundNumber, ArrayList<Player> player){
        this.score = score;
        this.player1 = (Player) player.get(0);
        this.player2 = (Player) player.get(1);
        this.roundNumber = roundNumber;
        runningRound();
    }

    private void runningRound(){
        Shapes p1option;
        Shapes p2option;

        System.out.println("#YOU ARE PLAYING NOW !!!\n" +
                "#ROUND " + roundNumber + ":\n" +
                "#LIVE SCORE: P1 = " + score.getP1Score() + " || P2 = " + score.getP2Score() +
                "\n#====================================================");
        System.out.println("# P1 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#\n");

        p1option = player1.chooseAShape();
        System.out.println("# P2 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#");
                
        p2option = player2.chooseAShape();
        ROCKPAPERSCISSOR(p1option, p2option);
    }

    //ESTA FUNCION NO ESTA DETERMINANDO BIEN LOS RESULTADOS REVISAR PORQUE
    // PROBABLEMENTE SEA POR COMO SE ESTA COMPARANDO 
    // poner asi: p1option contiene un enum Shape if(p1option && p2option) asignar puntos
    private void ROCKPAPERSCISSOR(Shapes p1option, Shapes p2option){
        System.out.println("player 1 with " + p1option.toString() + " and player 2 with " + p2option.toString());
        System.out.println("##READY . . . ?\n" +
                "#\n" +
                "#\n");
        //reglas del juego
        //player1Shape vs player2Shape
        if( (p1option.toString() == "Paper" && p2option.toString()== "Rock") ){
            updateScoreGame(1);
        }
        if( (p1option.toString() == "Paper" && p2option.toString()== "Scissors") ){
            updateScoreGame(2);
        }
        if( (p1option.toString() == "Paper" && p2option.toString()== "Paper") ){
            updateScoreGame(3);
        }
        if( (p1option.toString() == "Rock" && p2option.toString()== "Rock") ){
            updateScoreGame(3);
        }
        if( (p1option.toString() == "Rock" && p2option.toString()== "Scissors") ){
            updateScoreGame(1);
        }
        if( (p1option.toString() == "Rock" && p2option.toString()== "Paper") ){
            updateScoreGame(2);
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "Rock") ){
            updateScoreGame(2);    
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "Scissors") ){
            updateScoreGame(3);
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "Paper") ){
            updateScoreGame(1);
        }

    }

    private void updateScoreGame(int assingPoint){
        if(assingPoint == 1){
            score.updateP1Score();
        }
        if(assingPoint == 2){
            score.updateP2Score();
        }
        if(assingPoint == 3){
            score.updateP1Score();
            score.updateP2Score();
        }
    }

    public Score returnScoreInfo(){
        return this.score;
        // List<Integer> myList = new ArrayList<>();
        // myList.add(0, p1Score);
        // myList.add(1, p2Score);
        // return myList;
    }
}
