package Labs;

/*
Write a program that calculates the total commission receives based on the table below. 
The program will accept the sales volume and calculate the commission. 
Display the commission in two decimal places.
 */

import java.util.Scanner;

public class L03Q03 {
    public static void main(String[] args) {
        double price,total,comm;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the price : ");
        price = sc.nextDouble();
        
        if (price <= 100){
            comm = price * 5/100;
            total = price + comm;
            System.out.printf("The total price is : %6.2f\n",total);
            System.out.printf("The total comission is : %6.2f\n",comm);
        }
        else if (price > 100 && price <= 500){
            comm = price * 7.5/100;
            total = price + comm;
            System.out.printf("The total price is : %6.2f\n",total);
            System.out.printf("The total comission is : %6.2f\n",comm);
        }
        else if (price > 500 && price <= 1000){
            comm = price * 10/100;
            total = price + comm;
            System.out.printf("The total price is : %6.2f\n",total);
            System.out.printf("The total comission is : %6.2f\n",comm);
        }
        else if (price > 1000){
            comm = price * 12.5/100;
            total = price + comm;
            System.out.printf("The total price is : %6.2f\n",total);
            System.out.printf("The total comission is : %6.2f\n",comm);
        }
        else {
            System.out.println("Invalid dumbass");
        }
    }
}//ぶるぶ:3
