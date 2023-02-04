package Tutorials;

//Count the number of alphabet U and M from a sentence entered by user.

import java.util.Scanner;

public class T01Q08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input your sentence : ");
        String sen = scn.nextLine();
        int u = 0;
        int m = 0;
        
        for (int i = 0; i < sen.length(); i++){
            char c = sen.charAt(i);
        if (c == 'U' || c == 'u') {
            u++;
        }
        if (c == 'M' || c == 'm') {
            m++;
        }
    }
        System.out.println("Number of 'U'/'u': " + u);
        System.out.println("Number of 'M'/'m': " + m);
    }
}//ぶるぶ:3
