package Tryouts;

import java.util.Random;

public class Randoes {
    public static void main(String[] args) {
        Random rnd = new Random();
        
        int a = rnd.nextInt(100)+ 1; //values will be generated from 1-100
        System.out.println(a);
        
        int b = 50;
        int num = rnd.nextInt(b)+ 1; //1-50
        System.out.println(num);
    }
}
