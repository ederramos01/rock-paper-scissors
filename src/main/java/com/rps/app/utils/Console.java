package com.rps.app.utils;

import java.util.Scanner;

public class Console {
    
    private static Scanner scanner = new Scanner(System.in);
    private final static String FIRST_LINE= "\n";

    public static int getInt(){
        int responseInt = 0;
        boolean error = false;
        do{
            try {
                responseInt = scanner.nextInt();
                error = false;
            } catch (Exception e) {
                error = true;
            }
        }while(error);
        return responseInt;
    }

    public static int getInt(String message) {
        int responseInt = 0;
        boolean error = false;
        do{
            try {
                System.out.println(message);
                responseInt = scanner.nextInt();
                error = false;
            } catch (Exception e){
                error = true;
            }
        } while(error);
        return responseInt;
    }

    public static void printTitle(String message) {
        System.out.println(FIRST_LINE);
        printLine("####################################");
        printLine(message);
        printLine("####################################");
    }

    public static void printWhiteLine(){
        System.out.println(FIRST_LINE);
    }

    public static void printLine(String text){
        System.out.println(text);
    }

    public static String readString(String message){
        System.out.print(message);
        return scanner.nextLine();
    }

    public static int readInt(String message){
        int result = 0;
        boolean validResult = false;
        while (!validResult) {
            try {
                result = Integer.parseInt(readString(message));    
                validResult = true;
            } catch (Exception e) {
                printLine(" *** Number invalid ***");
                validResult = false;
            }
        }
        return result;
    }

    public static void printMultipleLines(String text, int maxLenght){
        do {
            if (text.length()>maxLenght){
                printLine(text.substring(0, maxLenght));
                text = text.substring(maxLenght+1);
            }
            else{
                printLine(text);
            }

        } while (text.length()> maxLenght);
    }
    
}
