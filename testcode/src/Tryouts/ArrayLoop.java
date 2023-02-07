package Tryouts;

public class ArrayLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        
        // or u can do it this way
        
        for (String j : cars) {        //this is called a for-each loop
            System.out.println(j);
        }
    }
}
