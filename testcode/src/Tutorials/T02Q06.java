package Tutorials;

/*
Write a java program that print the circumference of a circle.
The input of the program is diameter.
Display the result in three decimal places. (Note π = Math.PI)
*/

import java.util.Scanner;

public class T02Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d,c;
        
        System.out.printf("Enter the diameter of the circle : ");
        d = sc.nextDouble();
        
        c = d * Math.PI;
        System.out.printf("\nThe circumference of the circle is : %6.3f\n", c);
    }
}//ぶるぶ:3
