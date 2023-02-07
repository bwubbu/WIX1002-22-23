package Tryouts;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        
        x = 1;
        y = 0;
        
        while (x <= 10){
            y += x;
            x++;
            
            System.out.println(y);
        }
        boolean lol = true;
        while(lol){
            x = sc.nextInt();
            if (x < 0)
                lol = false;

            System.out.println(lol);
            break;
        }
        int i = 0;
        while (i <5) {
            System.out.println(i);
            i++;
        }
    }
}
