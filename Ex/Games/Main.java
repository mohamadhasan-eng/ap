package Ex.Games;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("SUDOKU GAME");
        String s = "sudoku1";
        Sudoku sudoku = new Sudoku(s);
        sudoku.setStartTime();
        sudoku.loadSudokuFromFile();
        while (true) {
            int row = 0;
            int col = 0;
            int value = 0;
            sudoku.printSudoku();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 to play or 2 to stop: ");
            if (scanner.nextLine().equals("1")) {
                System.out.println("Enter 1 for fill or 2 for remove: ");
                if (scanner.nextLine().equals("1")) {
                    System.out.println("please enter row: ");
                    row = scanner.nextInt();
                    System.out.println("please enter col: ");
                    col = scanner.nextInt();
                    System.out.println("please enter value[9..0]: ");
                    value = scanner.nextInt();
                    if (sudoku.sudokuValidate(row, col, value)) {
                        if (sudoku.isComplete()) {
                            break;
                        } else {
                            sudoku.fill(row, col, value);
                        }
                    }
                } else {
                    sudoku.remove(row, col);
                }
            } else {
                break;
            }
        }
    }
}
