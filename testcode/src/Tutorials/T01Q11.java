package Tutorials;

//Display a list of 5 random numbers in descending order. (Sort)

import java.util.Random;
import java.util.Arrays;

public class T01Q11 {
    public static void main(String[] args) {
    int[] num = new int[5];
    Random rnd = new Random();
    
        for (int i = 0; i < num.length; i++) {
        num[i] = rnd.nextInt(101);
    }
    Arrays.sort(num);                               //loop the array in reverse to count descending
        for (int i = num.length - 1; i >= 0; i--) {
        System.out.println(num[i]);
        }
    }
}//ぶるぶ:3