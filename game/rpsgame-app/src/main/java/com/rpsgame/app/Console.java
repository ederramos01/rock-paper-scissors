package com.rpsgame.app;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        int responseInt = 0;
        boolean error = false;
        do {
            try {
                System.out.println(message);
                responseInt = scanner.nextInt();
                error = false;
            } catch (Exception e) {
                error = true;
            }
        } while (error);
        return responseInt;
    }
}
