package Labs;

/*
Write a program that generates a non-negative random integer. Display the number of
digits in the integer.
 */

import java.util.Random;

public class L04Q06 {
    public static void main(String[] args) {
        Random rn = new Random();
        int num, digit;
        
        do{
            num = rn.nextInt();
        }
        while (num < 0);
        
        if (num / 10 != 0){
        }
    }
    
}
