package Tutorials;

//Determine whether a random number is greater than 50.

import java.util.Random;

public class T01Q02 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt(100);
        
        if (x > 50){
            System.out.println("The random number " + x + " is greater than 50");
        }
        else {
            System.out.println("The random number " + x + " is not greater than 50");
        }
    }
}//ぶるぶ:3
