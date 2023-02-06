package Labs;

/*
Write a program that stimulates a simple calculator. 
It reads two integers and a character. If the character is a +, the sum is printed; 
if it is a -, the difference is printed; if is a *, the multiplication is printed; 
if it is a /, the quotient is printed; and if it is a %, the remainder is printed. 
(Use the String.charAt(0) to return the character)
 */

import java.util.Scanner;

public class L03Q01 {
    public static void main(String[] args) {
        int deez,nuts,res;
        char operand;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two integer numbers : ");
        deez = sc.nextInt();
        nuts = sc.nextInt();
        
        System.out.println("Enter the operand : ");
        operand = sc.next().charAt(0);
        
        switch (operand) {
            case '+':
                res = deez + nuts;
                System.out.println(deez + " + " + nuts + " = " + res);
                break;
            case '-':
                res = deez - nuts;
                System.out.println(deez + " - " + nuts + " = " + res);
                break;
            case '*':
                res = deez * nuts;
                System.out.println(deez + " * " + nuts + " = " + res);
                break;
            case '/':
                res = deez / nuts;
                System.out.println(deez + " / " + nuts + " = " + res);
                break;
            case '%':
                res = deez % nuts;
                System.out.println(deez + " % " + nuts + " = " + res);
                break;
        }
    }
}
