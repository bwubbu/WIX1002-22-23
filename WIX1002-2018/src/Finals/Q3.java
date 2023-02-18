package Finals;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, format;
        char type;
        
        System.out.println("Enter font size : ");
        size = sc.nextInt();
        
        System.out.println("Enter font type : ");
        type = sc.next().charAt(0);
        
        System.out.println("Enter format [ 1 - Vertical, 2 - Horizontal] :");
        format = sc.nextInt();
        
        if (format == 1) {
            
            // calculate number of rows and columns
            int k = size * 2 + 3;
            int g = size + 2;
            
            // use nested loops to generate the pattern
        for (int i = 1; i <=k; i++) {
            for (int j = 1; j <= g; j++) {
            if ( i == 1 || i == size + 2 || i == k || j == 1 || j == g) {
            System.out.print(type);
        }
            else {
                System.out.print(" ");
            }
        }
            System.out.println("");
            }
        }
        else if (format == 2) {
            int k = size * 2 + 3;
            int g = size + 2;
        for (int i = 1; i <= g; i++) {
            for (int j = 1; j <= k; j++) {
            if ( j == 1 || j == size + 2 || j == k || i == 1 || i == g) {
                System.out.print(type);
            }
            else {
                System.out.print(" ");
            }
        }
            System.out.println("");
        }
        }
    }
}
