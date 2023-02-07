package Tryouts;

public class MathTry {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 10)); //maximum number
        System.out.println(Math.min(4, 12)); //minimum number
        System.out.println(Math.sqrt(64));   //square root
        System.out.println(Math.abs(-4.7));  //absolute positive
        System.out.println(Math.random());   //random number from 0.0 - 1.0
        System.out.println(Math.random()*101); // 0 to 100 in double format
        
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum); // 0 to 100 in int format
    }
}
