package Ex.exp03;

import java.util.Scanner;

public class E3_2 {
    public static void main(String[] args) {
        System.out.println("Calculating the determinant of a matrix 2*2: ");
        System.out.println("Please enter the matrix values(v): ");
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int v = scanner.nextInt();
                matrix[i][j] = v;
            }
        }
        System.out.println("______________________");
        System.out.println("Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        System.out.println("determinant: " + determinant);
    }
}
