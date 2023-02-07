package Tryouts;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        String pass,conpass;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your password : ");
        pass = sc.nextLine();
        System.out.println("Confirm your password : ");        
        conpass = sc.nextLine();
        
        if (pass.equals(conpass))
            System.out.println("Congrats on still remembering your password after 5 seconds!");
        else{
            System.out.println("no fking way u forgot already");
        }
        String n1,n2;
        
        n1 = "Blub";
        n2 = "Blub";
        
        int result = n1.compareTo(n2);
        if (result < 0) {
        System.out.println(n1 + " comes before " + n2);
        } else if (result == 0) {
        System.out.println(n1 + " is equal to " + n2);
        } else {
        System.out.println(n1 + " comes after " + n2);
        }
    }
}//ぶるぶ:3
