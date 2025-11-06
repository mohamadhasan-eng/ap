package Ex.exp03;

import java.util.Scanner;

public class E3_4 {
    public static void main(String[] args) {
        System.out.println("Calculate the row with the largest sum of elements: ");
        System.out.println("Please Enter the row(r): ");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println("Please Enter the col(c): ");
        int c = scanner.nextInt();

        System.out.println("Please enter the matrix values(v): ");
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int v = scanner.nextInt();
                matrix[i][j] = v;
            }
        }


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] transpose = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("________________________");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
