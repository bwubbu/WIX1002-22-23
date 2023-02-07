package Tutorials;

/*
Write statements for each of the following
a. Find the largest integer n so that n3 is less than 2000.
b. Display the square number of the first twelve integers starting from 1.
c. Display a 4-by-5 matrix using random number within 0 to 100.
d. Compute the sum of numbers from 1 to a given number.
e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
 */

import java.util.Random;
import java.util.Scanner;

public class T04Q01 {
    public static void main(String[] args) {
        
        //Find the largest integer n so that n3 is less than 2000.
        
        int n = 0;
        
        while (n*n*n < 2000)
            n++;
        
        System.out.println("largest integer n so that n^3 is less than 2000 : " + (n - 1));
        
        //Display the square number of the first twelve integers starting from 1.
        
        int num,sq;
        
        for (num = 1; num <= 12; num++){
            sq = num*num;

            System.out.println("The square number of the first twelve integers : " + sq);
        }
        
        //Display a 4-by-5 matrix using random number within 0 to 100.
        
        Random rnd = new Random();

        int rows = 4;
        int cols = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int numb = rnd.nextInt(101);
                System.out.print(numb + "\t");
            }
                System.out.println();
        }

        //Compute the sum of numbers from 1 to a given number.
        
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("Enter a number : ");
        int d = sc.nextInt();
        
        for (int i = 0; i <= d; i++){
            sum+=i;
        }
        System.out.printf("The sum of number 1 until %d is %d\n",d ,sum);
        
        //Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
        
        double sume = 0;
        
        for (int i = 1; i <= 25; i++ ) {
                sume += (double) i / (25 - i + 1);
        }
        System.out.printf("Sum of the series: %.2f", sume);
    }  
 }   


