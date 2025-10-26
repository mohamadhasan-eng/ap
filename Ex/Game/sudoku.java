package Ex.Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sudoku {
    public static void main(String[] args) throws FileNotFoundException {
        int[][] sudoku = new int[9][9];

        Scanner scanner = new Scanner(new File("sudoku"));
        int i = 0;

        while (scanner.hasNext() && i < 9) {
            String line = scanner.nextLine();
            String[] split = line.split(",", -1);

            for (int j = 0; j < 9 && j < split.length; j++) {
                String s = split[j].trim();
                if (!s.isEmpty()) {
                    sudoku[i][j] = Integer.parseInt(s);
                } else {
                    sudoku[i][j] = 0;
                }
            }
            i++;
        }
        printSudoku(sudoku);

        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter row , col and value(r , c , v):");
            System.out.println("row interval(0...9):");
            int r = scanner1.nextInt();
            System.out.println("col interval(0...9):");
            int c = scanner1.nextInt();
            System.out.println("value interval(0...9):");
            int v = scanner1.nextInt();
            if (r < 0 && r > 9 && c < 0 && c > 9 && v < 0 && v > 9) {
                System.out.println("Please enter row , col and value(r , c , v):");
                System.out.println("row interval(0...9):");
                r = scanner1.nextInt();
                System.out.println("col interval(0...9):");
                c = scanner1.nextInt();
                System.out.println("value interval(0...9):");
                v = scanner1.nextInt();
            } else {
                if (sudokuValidate(sudoku, r, c, v)) {
                    sudoku[r][c] = v;
                    System.out.println("You want play (yes = 1 and no = 0):");
                    int res = scanner.nextInt();
                    if (res == 0) {
                        break;
                    } else {
                        System.out.println("Please enter row , col and value(r , c , v):");
                        System.out.println("row interval(0...9):");
                        r = scanner1.nextInt();
                        System.out.println("col interval(0...9):");
                        c = scanner1.nextInt();
                        System.out.println("value interval(0...9):");
                        v = scanner1.nextInt();
                    }
                } else {
                    System.out.println("Please enter row , col and value(r , c , v):");
                    System.out.println("row interval(0...9):");
                    r = scanner1.nextInt();
                    System.out.println("col interval(0...9):");
                    c = scanner1.nextInt();
                    System.out.println("value interval(0...9):");
                    v = scanner1.nextInt();
                }
            }
            printSudoku(sudoku);
        }
    }

    static void printSudoku(int[][] sudoku) {
        System.out.println("Sudoku table:");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("______________________");
            }
            for (int j = 0; j < 9; j++) {

                System.out.print(sudoku[i][j] + " ");
                if (j % 3 == 2 && j < 8) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
    }

    static boolean sudokuValidate(int[][] sudoku, int row, int col, int value) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == value) {
                System.out.println("Error: this value exists in row.");
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == value) {
                System.out.println("Error: this value exists in col.");
                return false;
            }
        }
        int starti = row / 3 * 3;
        int startj = col / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[starti + i][startj + j] == value) {
                    System.out.println("Error: this value exists in box.");
                    return false;
                }
            }
        }
        return true;
    }
}