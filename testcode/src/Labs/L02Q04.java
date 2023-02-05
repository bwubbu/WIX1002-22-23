package Labs;

//Write a program that converts the seconds to hours, minutes and seconds.

import java.util.Scanner;

public class L02Q04 {
    public static void main(String[] args) {
        int s,m,h,rs;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds : ");
        s = sc.nextInt();
        
        h = s/3600;
        m = (s%3600)/60;
        rs = s%60;
        
        System.out.println(s + " seconds is " + h + " hours " + m + " minutes " + rs + " seconds");
    }
}//ぶるぶ:3
