package Tutorials;

//Request two numbers from the user and print the multiplication of the numbers.

import java.util.Scanner;

public class T01Q01 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number = ");
        x = sc.nextInt();
        
        System.out.println("Enter Second number = ");
        y = sc.nextInt();
        
        System.out.println(x * y);
    }
}//ぶるぶ:3
