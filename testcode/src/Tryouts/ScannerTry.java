package Tryouts;

import java.util.Scanner;

public class ScannerTry {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String fullname, firstname, lastname;
        
        System.out.println("Please state your first name : ");
        firstname = scn.nextLine();
        
        System.out.println("Please state your last name : ");
        lastname = scn.nextLine();
        
        fullname = firstname + " " + lastname;
        System.out.println("Welcome " + fullname + " to whatever this is!");
    }
}
