package Tutorials;

/*
Write the java statements that determine whether the Leap year. 
A Leap year is divisible by 4 but not by 100. 
However, a Leap year is also divisible by 400.
 */

import java.util.Scanner;

public class T03Q05 {
    public static void main(String[] args) {
    int year;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
    year = sc.nextInt();

    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
        System.out.println(year + " is a leap year");
    } else {
        System.out.println(year + " is not a leap year");
        }
    }
}
