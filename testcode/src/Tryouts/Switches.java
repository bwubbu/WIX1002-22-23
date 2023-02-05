package Tryouts;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 3: ");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("1? 1 what bitch? 1 bullet to ur head?");
                break;
            case 2:
                System.out.println("number 2? no wonder ur parents prefered Samantha");
                break;
            case 3:
                System.out.println("wow this kid knows the number 3");
                break;
            default:
                System.out.println("dumbass we only accept 1-3");
        }
    }
}//ぶるぶ:3
