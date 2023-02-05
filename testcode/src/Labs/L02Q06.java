package Labs;

/**
Write a program that calculates the energy needed to heat water.
Q = M * (final temperature – initial temperature) * 4184
M = Weight of water in kg
Q = Energy in joules
The temperature are in degree Celsius
 */

import java.util.Scanner;

public class L02Q06 {
    public static void main(String[] args) {
        double g,M,inf,fif,inc,fic,Q;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the amount of water in gram : ");
        g = sc.nextDouble();
        
        M = g/1000;
        
        System.out.println("Enter the initial temperature in Fahrenheit: ");
        inf = sc.nextDouble();
        
        inc = (inf - 32) / 1.8;
        
        System.out.println("Enter the final temperature in Fahrenheit : ");
        fif = sc.nextDouble();
        
        fic = (fif - 32) / 1.8;
        
        Q = M * (fic - inc) * 4184;
        System.out.printf("The energy needed is : %8.6e", Q);
    }
}//ぶるぶ:3
