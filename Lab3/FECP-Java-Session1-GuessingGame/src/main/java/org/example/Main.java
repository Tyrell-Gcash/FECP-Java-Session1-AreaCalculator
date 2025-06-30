package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int secretNumber = (int)(Math.random() * 5) + 1;
        int guessesLeft = 1;

        System.out.println("I'm thinking of a number between 1 and 5");

        while(guessesLeft != 4) {

            System.out.printf("Guess %s:", guessesLeft);
            int playerGuess = scanner.nextInt();

            if(playerGuess == secretNumber){
                System.out.println("You Guessed It!");
                System.out.printf("You Win!");
                return;
            }
            else {
                System.out.println("Wrong Guess.");
                guessesLeft += 1;
            }
        }
        System.out.printf("You Lose. The correct number was %s", secretNumber);
    }
}