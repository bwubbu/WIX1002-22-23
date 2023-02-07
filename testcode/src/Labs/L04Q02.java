package Labs;

/*
Write a program that accepts an integer n from user and then sum the following
series.
1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)
 */

import java.util.Scanner;

public class L04Q02 {
    public static void main(String[] args) {
        int x,sum;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer : ");
        x = sc.nextInt();
        
        sum = 0;
        
        for (int i = 1; i <= x; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

