package Tutorials;

//Print the perimeter of a rectangle.

import java.util.Scanner;

public class T01Q05 {
    public static void main(String[] args) {
    int l,w,p;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please input the length of the rectangle : ");
    l = sc.nextInt();
    
    System.out.println("Please input the width of the rectangle : ");
    w = sc.nextInt();
    
    p = 2*(l + w);
    System.out.println("The perimeter of the rectangle is : " + p);
    }
}//ぶるぶ:3
