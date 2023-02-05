package Labs;

/**
Write a program that convert the temperature in degree Fahrenheit to degree Celsius.
The program will display the degree Celsius in two decimal places.
Celsius = (Fahrenheit – 32) / 1.8
 */

import java.util.Scanner;

public class L02Q01 {
    public static void main(String[] args) {
        double F,C;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value in Fahrenheit");
        F = sc.nextDouble();
        C = (F - 32) / 1.8;
        System.out.println(C + " Celsius");
    }
}//ぶるぶ:3
