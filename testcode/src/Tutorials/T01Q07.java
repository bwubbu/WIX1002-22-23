package Tutorials;

//Print the number of odd and even number from 10 random numbers generated by computer. The random number must be from 10 – 100.

import java.util.Random;

public class T01Q07 {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        Random rnd = new Random();
        int[] rndnum = new int[10];
        
        for (int i = 0; i < 10; i++){
            rndnum[i] = rnd.nextInt(91) + 10;
            System.out.println("Number " + (i+1) + ": " + rndnum[i]);
            if (rndnum[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of odd numbers : " + odd );
        System.out.println("Number of even numbers : " + even );
    }
}//ぶるぶ:3
