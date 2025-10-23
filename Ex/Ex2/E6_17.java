package Ex.Ex2;

import java.util.Scanner;

public class E6_17 {
    public static void main(String[] args) {

        System.out.println("Please entter a number(k): ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        char[][] array = new char[k][k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                array[i][j] = '*';
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if ((i == 0) || (i == k-1) || (j == 0) || (j == k-1)) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
