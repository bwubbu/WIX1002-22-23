package Tryouts;

public class ArraySum {
    public static void main(String[] args) {
        int total = 0;
        
        
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	for ( int i = 0; i < a.length; i++ ) {
        total += a[ i ];
        }
        System.out.println(total);
    }
}
