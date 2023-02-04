package Tutorials;

//Print the results of the two players’ dice game.

import java.util.Random;

public class T01Q04 {
    public static void main(String[] args) {
        int P1,P2;
        Random rnd = new Random();
        
        P1 = rnd.nextInt(7);
        P2 = rnd.nextInt(7);
        
        if (P1 > P2){
            System.out.println("Player 1 wins with " + P1 + " Points!");
        }
        else if (P2 > P1){
            System.out.println("Player 2 wins with " + P2 + " Points!");
        }
        else{
            System.out.println("It's a draw.");
        }
    }
}//ぶるぶ:3
