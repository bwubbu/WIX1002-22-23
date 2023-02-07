package Labs;

/*
Write a program that accepts an integer from user. Then, display its entire factors in
increasing order.
 */

import java.util.Scanner;

public class L04Q01 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer : ");
        x = sc.nextInt();
        
        System.out.print("Factors of " + x + " in increasing order : \n");
        
        for (int i = 1; i <= x; i++) {
            if (i == x)
                System.out.println(i);
            else if (x % i == 0)
                System.out.print(i + ", ");
        }
        
        System.out.print("Enter an integer: ");
        int y = sc.nextInt();

        System.out.print("Factors of " + y + " in decreasing order : \n");
        
        for (int i = y; i >= 1; i--) {
            if (i == 1)
                System.out.println(i);
            else if (y % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
