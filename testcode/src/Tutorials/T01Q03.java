package Tutorials;

//Print the pass/fail grade based on the mark entered by user. The passing mark is at least 40.

import java.util.Scanner;

public class T01Q03 {
    public static void main(String[] args) {
        int mark;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Please input the mark : ");
        
        mark = scn.nextInt();
        
        if (mark >= 40 && mark <= 100){
            System.out.println("User passed with " + mark + " marks");
        }
            else if (mark >= 0 && mark <= 39){
                System.out.println("User failed with " + mark + " marks");
            }
            else{
                System.out.println("Invalid Input, Out of range");
        }
    }
}//ぶるぶ:3
