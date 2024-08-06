package SnakeGameLadderGame;

import java.util.Random;

public class SnakeLadderGame {
    static int Player1 = 0 ;  //
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake And Ladder game!");
    }

    private static int rollDice(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }

}
