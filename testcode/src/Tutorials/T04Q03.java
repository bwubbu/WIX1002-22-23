package Tutorials;

/*
Write the statements that display the first ten values of the Fibonacci sequence.
Given the formula f1 = 1, f2 =1, fn = fn-1 + fn-2.
 */
public class T04Q03 {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        int next;
            System.out.print(f1 + " " + f2 + " ");
        for (int i = 3; i <= 10; i++) {
            next = f1 + f2;
            System.out.print(next + " ");
            f1 = f2;
            f2 = next;
        }
        System.out.println();
    }
}
