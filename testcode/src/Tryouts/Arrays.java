package Tryouts;

public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford"};
        int[] myNum = {10,20,30,40,50};
        
        
        System.out.println(cars[0]);
        System.out.println(myNum[3]);
        
        cars[0] = "Hyundai";
        
        for (String i : cars) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j : myNum) {
            System.out.print(j + " ");
        }
        
        // find the length of the array
        System.out.println();
        System.out.println(cars.length);
    }
}
