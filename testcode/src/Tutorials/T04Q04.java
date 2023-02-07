package Tutorials;

/*
Write the statements that display the string in reverse order. 
(use String.length() to get the length of the string).
 */

import java.util.Scanner;

public class T04Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence : ");
        String sentence = sc.nextLine();
        
        int cnt = sentence.length();
        
        for(int i = cnt-1;i >= 0;i--){

        System.out.print(sentence.charAt(i));
        }
    }
}
