package Labs;

/*
Write a simple two players dice game. Each player will take turns to roll a dice. The
first players that reach more than 100 points win the game. If the player rolls a 6, the
player will score 6 points and has the chance to roll again.
 */

import java.util.Random;
import java.util.Scanner;

public class L04Q05 {
    public static void main(String[] args) {      
        String play1,play2;
        int p1,p2,sum1,sum2;
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Player 1's name : ");
        play1 = sc.nextLine();
        System.out.println("Enter Player 2's name : ");
        play2 = sc.nextLine();
        
        sum1 = 0;
        sum2 = 0;
        
        do{
            do{
                p1 = rn.nextInt(6)+1;
                sum1 += p1;
                System.out.println(play1 + " scores " + p1);
            }
            while (p1 == 6);
            
            if (sum1 <= 100){
                do{
                    p2 = rn.nextInt(6)+1;
                    sum2 += p2;
                    System.out.println(play2 + " scores " + p2);
                }
                while (p2 == 6);
            }
        }
        while (sum1 <= 100 && sum2 <= 100);
        
        System.out.println(play1 +"'s total : " + sum1);
        System.out.println(play2 + "'s total : " + sum2);
        
        if (sum1 >= 100)
            System.out.println(play1 +" wins with " + sum1 + " points!");
        else{
            System.out.println(play2 +" wins with " + sum2 + " points!");
        }
    }
}
