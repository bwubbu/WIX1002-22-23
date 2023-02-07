package Tryouts;

// same name, different parameters

public class MethodOverloading {
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
        int num1 = plusMethod(8,5);
        
        double num2 = plusMethod(4.3, 6.2);
        
        System.out.println("int : " + num1);
        System.out.println("double : " + num2);
    }
}
