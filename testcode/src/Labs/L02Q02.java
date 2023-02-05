package Labs;

/*
Write a program to calculate the monthly payment for car loan.
The following are the inputs of the program.
Output the monthly payment in two decimal places.
P - The price of the car
D - Down payment
R - Interest Rate in %
Y - Loan duration in year
M - Monthly Payment
M = (P – D) * (1 + R*Y/100) / (Y *12)
 */

import java.util.Scanner;

public class L02Q02 {
    public static void main(String[] args) {
        double P,D,R,Y,M;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Price of the car : ");
        P = sc.nextDouble();
        
        System.out.print("Down Payment : ");
        D = sc.nextDouble();
        
        System.out.print("Interest rate (in %) : ");
        R = sc.nextDouble();
        
        System.out.print("Loan duration (in year) : ");
        Y = sc.nextDouble();
        
        M = (P - D) * (1 + R * Y / 100) / (Y * 12);
        System.out.printf("The monthly payment is : %4.2f", M);
    }
}//ぶるぶ:3
