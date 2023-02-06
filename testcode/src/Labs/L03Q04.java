package Labs;

/*
Write a simple two players dice game. 
Each player will roll the dice twice and the player with the highest score wins the game.
 */

import java.util.Random;

public class L03Q04 {
    public static void main(String[] args)throws InterruptedException {
        int p1,p2,p1re,p2re,p1tot,p2tot;
        Random rnd = new Random();
        
        p1 = rnd.nextInt(6)+1;
        System.out.println("Player 1 rolls the first dice and gets a : " + p1);
        Thread.sleep(2000);
        p2 = rnd.nextInt(6)+1;
        System.out.println("Player 2 rolls the first dice and gets a : " + p2);
        Thread.sleep(2000);
        
        p1re = rnd.nextInt(6)+1;
        p1tot = p1 + p1re;
        System.out.println("Player 1 rolls the second dice and gets a : " + p1re);
        Thread.sleep(2000);
        p2re = rnd.nextInt(6)+1;
        p2tot = p2 + p2re;
        System.out.println("Player 2 rolls the second dice and gets a : " + p2re);
        Thread.sleep(2000);
        
        if (p1tot > p2tot)
            System.out.println("Player 1 wins with " + p1tot + " rolls!");
        else if (p2tot > p1tot)
            System.out.println("Player 2 wins with " + p2tot + " rolls!");
        else {
            System.out.println("It's a tie!");
        }
    } 
}//ぶるぶ:3

