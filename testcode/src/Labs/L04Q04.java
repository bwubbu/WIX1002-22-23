package Labs;

/**
Write a program that ask user to enter the year and the first day of the year (0 for
Sunday, 1 for Monday, … , 6 for Saturday). Display the calendar for May and
August.
 */

import java.util.Scanner;

public class L04Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the year of your calendar : ");
        int year = sc.nextInt();                            //input for year
        System.out.println("Ennter the first day of the year 0 for Sunday, 1 for Monday, … , 6 for Saturday) : ");
        int fday = sc.nextInt();
        
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                
            }
        }
    }
    
}
