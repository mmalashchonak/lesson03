package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void startGame() {
        int userNumber;
        int computerNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number from 0 to 1000");
        userNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Processing...");
        for (int i = 1; ; i++) {
            Random random = new Random();
            computerNumber = random.nextInt(1000);
            if (userNumber == computerNumber) {
                System.out.println("You number is " + computerNumber + ". Done with " + i + " itterations.");
                break;
            }
        }
    }
}
