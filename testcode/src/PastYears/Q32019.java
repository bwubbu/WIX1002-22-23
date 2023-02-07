package PastYears;

import java.util.Scanner;

public class Q32019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String genome;

        System.out.print("Enter genome string [quit to stop]: ");
        genome = sc.nextLine();

        while (!genome.equals("quit")) {
            int start = genome.indexOf("ATG");
            int end = 0;
            boolean geneFound = false;

            while (start != -1) {
                end = genome.indexOf("TAG", start + 3);
                if (end == -1) {
                    end = genome.indexOf("TAA", start + 3);
                }
                if (end == -1) {
                    end = genome.indexOf("TGA", start + 3);
                }
                if (end != -1 && (end - start) % 3 == 0) {
                    geneFound = true;
                    System.out.println(genome.substring(start + 3, start));
                }
                start = genome.indexOf("ATG", start + 3);
            }

            if (!geneFound) {
                System.out.println("No gene is found");
            }
            System.out.print("Enter genome string [quit to stop]: ");
            genome = sc.nextLine();
        }
        sc.close();
    }
}