package Finals;

import java.util.Scanner;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int N,R,AAA = 0,AA = 0,A = 0;
        
        System.out.print("Enter N number: ");
        N = sc.nextInt();
        
        System.out.print("The random numbers are: ");
        for (int i = 0; i <= N; i++) {
            R = r.nextInt(101)+ 50;
            System.out.print(R + " ");
            
            int group = (R % 10);
            
            if (group >= 0 && group <= 3)
                AAA++;
            else if (group >= 4 && group <= 6)
                AA++;
            else{
                A++;
            }
        }
        System.out.println();
        System.out.println("Group AAA :" + AAA);
        System.out.println("Group AA :" + AA);
        System.out.println("Group A :" + A);
    }
}
