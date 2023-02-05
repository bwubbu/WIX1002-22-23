package Tryouts;

import java.util.Scanner;
import java.util.Random;

public class IfStatement {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert length : ");
        x = sc.nextInt();
        if (x > 9)
            System.out.println("DAMN! " + x + " INCHES! u be packin' bruh");
        else{
            System.out.println("Only " + x + " inches? u bring a happy meal widdat?");
        }
        int lol;
        Random rnd = new Random();
        
        lol = rnd.nextInt(20001);
        
        if (lol > 10000)
            System.out.println(lol + " bucks in yo bank account? how come u got no bithes?");
        else if (lol >= 5000 && lol <= 9999)
            System.out.println(lol + " bucks? that's ok ig");
        else{
            System.out.println(lol + " bucks ? Broke ass mf");
        }
    }
}//ぶるぶ:3
