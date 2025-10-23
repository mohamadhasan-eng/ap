package Ex.Ex2;

import java.util.Scanner;

public class E6_18 {
    public static void main(String[] args) {
        System.out.println("Please enter a number(k): ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        System.out.println("*");
        for (int i = 1; i < k; i++) {
            for (int j = 0; j < 1 + (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = k-1; i >= 0; i--) {
            for (int j = 0; j < (i*2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}