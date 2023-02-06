package Labs;

/*
Generate a random integer within 0 to 5 and display the integer in word.
 */

import java.util.Random;

public class L03Q02 {
    public static void main(String[] args) {
        int x;
        Random rnd = new Random();
        
        x = rnd.nextInt(6);
        
        switch (x){
            case 0 :
                System.out.println(x + " is zero.");
                break;
            case 1 :
                System.out.println(x + " is one.");
                break;
            case 2 :
                System.out.println(x + " is two.");
                break;
            case 3 :
                System.out.println(x + " is three.");
                break;
            case 4 :
                System.out.println(x + " is four.");
                break;
            case 5 :
                System.out.println(x + " is five.");
                break;
        }
    }
}//ぶるぶ:3
