package Tryouts;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        double c = (double) a/b;
        int d = (int) c;
        
        System.out.println(a / b);   //creates a whole value
        System.out.println(a / (double) b);   //creates a decimal value
        System.out.println(c);
        System.out.println(d);
    }
}
