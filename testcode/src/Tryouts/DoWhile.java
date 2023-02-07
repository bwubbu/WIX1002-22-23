package Tryouts;

public class DoWhile {
    public static void main(String[] args) {
        int x=11, y=0;
        
        do {
            y += x;
            x++;
        } 
        while (x<=10);
        System.out.println(y);
    }
}
