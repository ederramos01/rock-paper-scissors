package com.rps.app.view.player;

import java.util.Random;

import com.rps.app.utils.Console;
import com.rps.app.utils.Shape;

public class ComputerPlayerView extends PlayerView{

    @Override
    public String getName(String message) {
        Console.readString("Assigning a random name, press enter to continue . . .");
        String name = ComputerPlayerView.getAlphaNumericString(10);
        return name;
    }

    /**
     * source: https://www.geeksforgeeks.org/generate-random-string-of-given-size-in-java/
     * @param n
     * @return
     */
    static String getAlphaNumericString(int n) {

        // choose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    @Override
    public Shape selectShape() {
        Random myRandom = new Random();
        int option = myRandom.nextInt(3) + 1;
        return switch (option){
            case 1 -> Shape.Rock;
            case 2 -> Shape.Scissors;
            case 3 -> Shape.Paper;
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
    }
    
}
