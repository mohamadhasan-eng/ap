package Ex.exp03;

import java.util.Scanner;

public class E3_5 {
    public static void main(String[] args) {
        System.out.println("Remove row and col: ");
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

        System.out.println(" enter the row number to remove" + "(0-" + (r-1) + "): " );
        int rRemove = scanner.nextInt();
        System.out.println(" enter the col number to remove" + "(0-" + (c-1) + "): ");
        int cremove = scanner.nextInt();
        if (rRemove < 0 || rRemove >= r || cremove < 0 || cremove >= c) {
            System.out.println("Error: row and col incorrect");
            return;
        }

        int[][] nMatrix = new int[r-1][c-1];
        int nRow = 0;
        for (int i = 0; i < r; i++) {
            if ( i == rRemove) {
                continue;
            }
            int nCol = 0;
            for (int j = 0; j < c; j++) {
             if (j == cremove) {
                 continue;
             }
             nMatrix[nRow][nCol] = matrix[i][j];
             nCol++;
            }
            nRow++;
        }


        for (int i = 0; i < r-1; i++) {
            for (int j = 0; j < c-1; j++) {
                System.out.print(nMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
