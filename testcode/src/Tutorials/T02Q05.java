package Tutorials;

/*
Correct the error for the following statements.
a.
final double AMOUNT = "32.5";
AMOUNT += 10;
System.out.println("The amount is " + AMOUNT);
b.
string chapter = 'Summary';
System.out.println(chapter);
c.
int num;
++num++;
num1 = num;
d.
int num = 3000;
System.out.printf("%4.2f\n", num);
e.
String contact;
Scanner keyboard = new Scanner(System.out);
contact = keyboard.nextLine();
 */

import java.util.Scanner;

public class T02Q05 {
    public static void main(String[] args) {
        double AMOUNT = 32.5;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);
        
        String chapter = "Summary";
        System.out.println(chapter);
        
        int num = 3;
        int num1;
        num++;
        num1 = num;
        System.out.println(num1);
        
        double numb = 3000;
        System.out.printf("%6.2f\n", numb);
        
        String contact;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type in something idk : ");
        contact = keyboard.nextLine();
        System.out.println(contact);
    }
}//ぶるぶ:3
