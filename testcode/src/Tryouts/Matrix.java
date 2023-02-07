package Tryouts;

import java.util.Scanner;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int row,col;
        
        System.out.print("How many rows : ");
        row = sc.nextInt();
        
        System.out.print("How many columns : ");
        col = sc.nextInt();
        
        for (int i = 0; i < row; i++ ) {
            for (int j = 0; j < col; j++ ) {
                int num = rnd.nextInt(101);
                System.out.print(num + "\t");
            }
                System.out.println();
        }      
    }
}
