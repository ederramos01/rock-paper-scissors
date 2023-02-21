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

    private void ROCKPAPERSCISSOR(Shapes p1option, Shapes p2option){
        System.out.println("##READY . . . ?\n" +
                "#\n" +
                "#\n");
        if( (p1option.toString() == "Paper" && p2option.toString()== "Rock") ){
            updateScoreGame(1); //si es 1 gana p1
            announceWinnerOfTheRound(p1option, p2option, 1);
        }
        if( (p1option.toString() == "Paper" && p2option.toString()== "Scissors") ){
            updateScoreGame(2); //si es 2 gana p2
            announceWinnerOfTheRound(p1option, p2option, 2);
        }
        if( (p1option.toString() == "Paper" && p2option.toString()== "Paper") ){
            updateScoreGame(3);
            announceWinnerOfTheRound(p1option, p2option, 3);
        }
        if( (p1option.toString() == "Rock" && p2option.toString()== "Rock") ){
            updateScoreGame(3);
            announceWinnerOfTheRound(p1option, p2option,3);
        }
        if( (p1option.toString() == "Rock" && p2option.toString()== "Scissors") ){
            updateScoreGame(1);
            announceWinnerOfTheRound(p1option, p2option, 1);
        }
        if( (p1option.toString() == "Rock" && p2option.toString()== "Paper") ){
            updateScoreGame(2);
            announceWinnerOfTheRound(p1option, p2option, 2);
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "Rock") ){
            updateScoreGame(2);   
            announceWinnerOfTheRound(p1option, p2option, 2); 
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "Scissors") ){
            updateScoreGame(3);
            announceWinnerOfTheRound(p1option, p2option, 3);
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "Paper") ){
            updateScoreGame(1);
            announceWinnerOfTheRound(p1option, p2option, 1);
        }


    }

    private void announceWinnerOfTheRound(Shapes p1, Shapes p2, int winner) {
        // # ROCK BEATS SCISSORS 
        //# PLAYER 2 WINS!!!!! P2 HAVE SCORED 1 POINT OUT OF 3.
        if(winner == 1){
            System.out.println("# " + p1.toString() + " BEATS " + p2.toString());
            System.out.println("# " + player1.getName() + " WINS!!!!! " + player1.typePlayer() + " HAVE SCORED " + score.getP1Score() + " POINT OUT OF 3.");
        }
        if(winner == 2){
            System.out.println("# " + p2.toString() + " BEATS " + p1.toString());
            System.out.println("# " + player2.getName() + " WINS!!!!! " + player2.typePlayer() + " HAVE SCORED " + score.getP2Score() + " POINT OUT OF 3.");
        }
        if(winner == 3){
            System.out.println("# DRAW . . . " + p1.toString() + " are the same with " + p2.toString());
        }

    }

    private void updateScoreGame(int assingPoint){
        if(assingPoint == 1){
            score.updateP1Score();
        }
        if(assingPoint == 2){
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
