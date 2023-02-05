package Tutorials;

//Write the java statements that used the if statement to find the biggest number among three given integers.

import java.util.Scanner;

public class T03Q04 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("x : ");
        x = sc.nextInt();
        
        System.out.println("y : ");
        y = sc.nextInt();
        
        System.out.println("z : ");
        z = sc.nextInt();
        
        if (x > y && x > z)
            System.out.println("X is the biggest number");
        else if (y > x && y > z)
            System.out.println("Y is the biggest number");
        else{
            System.out.println("Z is the biggest number");
        }
    }
}
