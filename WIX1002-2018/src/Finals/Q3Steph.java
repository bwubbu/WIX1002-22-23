/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finals;

import java.util.Scanner;

/**
 *
 * @author PREDATOR HELIOS 300
 */
public class Q3Steph {
        public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter font size: ");
        int size=in.nextInt();
        System.out.print("Enter font type: ");
        String type=in.next(); 
        System.out.print("Enter format [1-Vertical, 2-Horizontal]: ");
        int format=in.nextInt();
        if(format==1){
        int k=size*2+3; 
        int g=size+2;
        for(int i=1;i<=k;i++){
        for(int j=1;j<=g;j++){
        if(i==1||i==size+2||i==k||j==1||j==g){
            System.out.print(type);   
        }else{
            System.out.print(" ");
        }
        }
            System.out.println("");
        }
        }
        else if(format==2){
        int k=size*2+3; 
        int g=size+2;
        for(int i=1;i<=g;i++){
        for(int j=1;j<=k;j++){
        if(j==1||j==size+2||j==k||i==1||i==g){
            System.out.print(type);   
        }else{
            System.out.print(" ");
        }
        }
            System.out.println("");
        }
        
        
        
        
    }
}
}

