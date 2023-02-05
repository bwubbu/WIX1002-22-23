package Labs;

/*
Write a program that generates one random number. 
* The range of the random number is 0 to 10000. 
* Display the number and the sum of all the digits in the number.
 */

import java.util.Random;

public class L02Q05 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x, sum, y;
        
        x = rnd.nextInt(10001);
        System.out.println("The number is : " + x);
        
        sum = 0;
        y = x;
        while(y >0){
            sum += y%10;
            y /= 10;
        }
        System.out.println("the sum of its digits is : " + sum);
    }
}//ぶるぶ:3
