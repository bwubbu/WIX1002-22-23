package Tutorials;

/*
Write statements for each of the following
a. Determine whether 3x8=27.
b. Determine whether an input integer is an odd number or even number.
c. Determine whether a character is a capital letter.
d. Display two strings in alphabetical order ignoring their case.
e. A switch statement that display Sunday, Monday, .., Satudary if the input is 0, 1, …, 6.
 */

import java.util.Scanner;

public class T03Q01 {
    public static void main(String[] args) {
        //Determine whether 3x8=27.
        int x,y,ans;
        
        x = 3;
        y = 8;
        ans = x*y;
        
        switch (ans){
            case 27:
                System.out.println("3x8 equals to 27");
            break;
            default:
                System.out.println("3x8 does not equal to 27");
        }
        //Determine whether an input integer is an odd number or even number.
        int a,b;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a value : ");
        a = sc.nextInt();
        
        b = a%2;
        
        switch (b){
            case 0:
                System.out.println(a + " is an even number");
                break;
            default:
                System.out.println(a + " is an odd number");
        }
        //Determine whether a character is a capital letter.
        char lol;
        
        lol = 'D';  //for DEEZ
        System.out.println(lol);
        
        if (lol >= 'A' && lol <= 'Z')
            System.out.println(lol + " is a capital letter");
        else{
            System.out.println(lol + " is a not a capital letter");
        }
        //Display two strings in alphabetical order ignoring their case.
        String deez,nuts;
        
        deez = "Skill";
        nuts = "Issue";
        int res = deez.compareToIgnoreCase(nuts);
        
        if (res < 0)
            System.out.printf(deez + "\n" + nuts);
        else if (res == 0)
            System.out.println("They're the same lol");
        else{
            System.out.println(nuts + "\n" + deez);
        }
        //A switch statement that display Sunday, Monday, .., Satudary if the input is 0, 1, …, 6.
        int d;
        
        System.out.print("Enter a number between 0-6 : ");
        d = sc.nextInt();
        
        switch (d){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("The program only accepts the number between 0-6 lol");
        }
    }
}
