package Tryouts;

// Any method like int char can be returned (exception is void)

public class ReturnMethod {
    static int myMethod(int x) {
    return 5 + x;
    }
    static int square(int y) {
        return y*y;
    }
    static int addition(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(3));
        System.out.println(square(4));
        
        int c = (addition(3,5));
        System.out.println(c);
    }
}
