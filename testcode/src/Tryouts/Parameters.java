package Tryouts;

import java.util.Scanner;

public class Parameters {
        static void myMethod(String fname, int age) {          //parameter
            System.out.println(fname + " is " + age);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String x;
            int y;
            System.out.println("Enter name : ");
            x = sc.nextLine();
            
            System.out.println("Enter age : ");
            y = sc.nextInt();
            myMethod(x, y);                          //argument
    }
}