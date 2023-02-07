package Tryouts;

public class forStatement {
    public static void main(String[] args) {
        int x,y,z;
        
        for (x = 1; x <= 5; x++){
            if (x == 2)
                continue;
        System.out.println("Counter is " + x);
    }
        for (y = 10; y >= 0; y--){
            if (y == 3)
                break;
            System.out.println("Counter is " + y);
        }
    }
}