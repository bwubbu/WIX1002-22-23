package Tryouts;

public class forLoop {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
            System.out.println();
        for (int j = 0; j <= 10; j = j+2) {
            System.out.print(j + " ");
        }
                System.out.println();
        for (int i = 0; i < 10; i++) {
            if ( i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
                System.out.println();
        for (int i = 0; i < 10; i++) {
            if ( i == 4) {
                continue;
            }
            System.out.print(i + " ");
        }
        
        System.out.println();        
        int x = 0;
        while (x < 10) {
            System.out.print(x + " ");
            x++;
            if (x == 4){
                break;
            }
        }
    }
}
