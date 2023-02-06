/*
 */
package Labs;

/*
Write a program that asks users to enter the radius of a circle and a coordinate point (x, y). 
Determine whether the point is inside or outside the circle centered at (0, 0).
 */

import java.util.Scanner;

public class L03Q06 {
    public static void main(String[] args) {
        double rad,x,y,diam,dist;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle : ");
        rad = sc.nextDouble();
        
        System.out.println("Enter the coordinate for x : ");
        x = sc.nextDouble();
        
        System.out.println("Enter the coordinate for y : ");
        y = sc.nextDouble();
        
        dist = Math.sqrt(x*x + y*y);
        
        if (dist < rad){
            System.out.println("The point is inside the circle");
        }
        else if (dist == rad)
            System.out.println("The point is on the circle");
        else{
            System.out.println("The point is outside the circle");
        }
    }
}
