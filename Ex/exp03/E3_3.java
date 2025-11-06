package Ex.exp03;

import java.util.Scanner;

public class E3_3 {
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
        System.out.println("_________________________");

        int s = -999999999;
        int row = 0;
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < r; j++) {
                sum += matrix[i][j];
            }
            if (sum > s) {
                s = sum;
                row = i;
            }
        }
        System.out.println("Row with the highest sum of digits: " + (row + 1) + ", sum of elements: " + s);
    }
}