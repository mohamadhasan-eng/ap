package Ex.exp03;

import java.util.Scanner;

public class E3_6 {
    public static void main(String[] args) {
        System.out.println("The 2*2 submatrix with the largest sum: ");
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


        if (r < 2 || c < 2) {
            System.out.println("Error: Matrix not 2*2.");
            return;
        }
        int sum = -999999999;
        int startRow = -1;
        int startCol = -1;
        for (int i = 0; i <= r - 2; i++) {
            for (int j = 0; j <= r - 2; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (currentSum > sum) {
                    sum = currentSum;
                    startRow = i;
                    startCol = j;
                }
            }
        }
        System.out.println("_________________________");
        System.out.println("row : " + startRow + ", col: " + startCol);
        System.out.println("2*2 submatrix:");
        System.out.println(matrix[startRow][startCol] + " " + matrix[startRow][startCol + 1]);
        System.out.println(matrix[startRow + 1][startCol] + " " + matrix[startRow + 1][startCol + 1]);
    }
}
