package Labs;

/*
Cramer’s rule is used to solve the linear equations.
ax + by = e, cx + dy = f; x = (ed-bf)/(ad-bc) y=(af-ec)/(ad-bc)
Write a program that ask the user to enter a, b, c, d, e, f. and display the result of x and y. 
If ad – bc is equal to 0. Display "The equation has no solution"
 */

import java.util.Scanner;

public class L03Q05 {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        double x,y;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value for a : ");
        a = sc.nextInt();
        
        System.out.print("Enter the value for b : ");
        b = sc.nextInt();
        
        System.out.print("Enter the value for c : ");
        c = sc.nextInt();
        
        System.out.print("Enter the value for d : ");
        d = sc.nextInt();
        
        System.out.print("Enter the value for e : ");
        e = sc.nextInt();
        
        System.out.print("Enter the value for f : ");
        f = sc.nextInt();
        
        if (a*d == b*c){
            System.out.println("The equation has no solution");
            return;
        }
        
        x = (double) (e*d - b*f)/(a*d - b*c);
        y = (double) (a*f - e*c)/(a*d - b*c);
        
        System.out.printf("x is : %4.2f\n", x);
        System.out.printf("y is : %4.2f\n", y);
    }  
}//ぶるぶ:3
