package Labs;

/*
Write a program that generates three random numbers. 
The range of the random number is 10 to 50. 
Display the three numbers, sum of the numbers and the average in two decimal places.
*/

import java.util.Random;

public class L02Q03 {
    public static void main(String[] args) {
        Random rnd = new Random();
        double x,y,z,sum,avg;
        
        x = rnd.nextDouble()* 41 + 10;
        y = rnd.nextDouble()* 41 + 10;
        z = rnd.nextDouble()* 41 + 10;
        
        System.out.printf("X : %4.2f\n", x);
        System.out.printf("X : %4.2f\n", y);
        System.out.printf("X : %4.2f\n", z);
        
        sum = x+y+z;
        System.out.printf("Sum of the three numbers : %4.2f\n", sum);
        
        avg = sum/3;
        System.out.printf("The average of the three numbers : %4.2f\n", avg);
    }
}//ぶるぶ:3
