package Tryouts;

/*

 */
public class labelStatement {
    public static void main(String[] args) {
    label:
        for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if (i * j >= 20) {
            break label;
            }
            System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
