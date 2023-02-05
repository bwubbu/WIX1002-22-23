package Tutorials;

/**
Write a java program that converts inches to meters. 
(Given 1 inch equals to 2.54 centimeters).
Print the output in two decimal places.
 */

import java.util.Scanner;

public class T02Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inch, meter;
        
        System.out.printf("Please enter the value of the inch to convert : ");
        inch = sc.nextDouble();
        
        meter = inch * 2.54 / 100;
        System.out.printf("%4.2f inches = %4.2f meters\n",inch,meter);
    }
}//ぶるぶ:3
