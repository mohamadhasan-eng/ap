package Ex.exp03;

import java.util.Scanner;

public class E3_1 {
    public static void main(String[] args) {
        System.out.println("Please Enter the row(r): ");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println("Please Enter the col(c): ");
        int c = scanner.nextInt();

        System.out.println("Please enter the matrix values(v): ");
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int v = scanner.nextInt();
                m[i][j] = v;
            }
        }
        System.out.println("_________________________________");
        System.out.println("Matrix 1: ");
        print(r, c, m);
        System.out.println("_________________________________");

        System.out.println("Please Enter the row(r): ");
        int r1 = scanner.nextInt();
        System.out.println("Please Enter the col(c): ");
        int c1 = scanner.nextInt();

        System.out.println("Please enter the matrix values(v): ");
        int[][] m1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                int v = scanner.nextInt();
                m1[i][j] = v;
            }
        }
        System.out.println("_________________________________");
        System.out.println("Matrix 2: ");
        print(r1, c1, m1);
        System.out.println("_________________________________");

        int res = 0;
        int[][] multipliedMatrix = new int[r][c1];
        if (c == r1){
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c1; j++) {
                    for (int k = 0; k < c; k++) {
                        res += m[i][k] * m1[k][j];
                    }
                    multipliedMatrix[i][j] = res;
                    res = 0;
                }
            }
            System.out.println("Product of matrices: ");
            print(r, c1, multipliedMatrix);
        }
    }

    static void print(int r, int c, int[][] array) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

