package Ex.Games;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Sudoku {

    private int[][] sudoku;
    private LocalDateTime startTime;
    private String fileAddress;
    private int fillCount;
    private int removeCount;

    public Sudoku(String fileAddress) {
        this.sudoku = new int[9][9];
        this.startTime = LocalDateTime.now();
        this.fileAddress = fileAddress;
        this.fillCount = 0;
        this.removeCount = 0;
    }

    public void printSudoku() {
        System.out.println("+--------------------------------+");
        System.out.println("Game start time: " + startTime);
        System.out.println("Fill Count: " + fillCount);
        System.out.println("Sudoku table: ");
        for (int i = 0; i < sudoku.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("______________________");
            }
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] + " ");
                if (j % 3 == 2 && j < 8) {
                    System.out.print("|");
                }
            }
                System.out.println();
        }
    }

    public void fill(int row, int col, int value) throws FileNotFoundException {
        if (sudokuValidate(row, col, value)){
            sudoku[row][col] = value;
            fillCount++;
        }
        saveToFile();
    }

    public void remove(int row, int col) throws FileNotFoundException {
        sudoku[row][col] = 0;
        removeCount++;
        saveToFile();
    }

    public boolean sudokuValidate(int row, int col, int value) {
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

    public boolean isComplete(){
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                if (sudoku[i][j] != 0){
                    if (sudokuValidate(i, j, sudoku[i][j])){
                        System.out.println("You win!!!!!");
                        System.out.println("The game is over.");

                        return true;
                    }
                }
                else {
                    System.out.println("There is still an empty house!");
                    return false;
                }
            }
        }
        return true;
    }

    private void saveToFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileAddress);
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                writer.println(sudoku[i][j] + " ");
            }
            writer.println();
        }
        writer.println("Game start time: " + startTime);
        writer.println("Fill Count: " + fillCount);
        writer.println("remove Count: " + removeCount);
    }

    public void loadSudokuFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileAddress));
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                if (scanner.hasNextInt()) {
                    sudoku[i][j] = scanner.nextInt();
                }
            }
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.startsWith("Game start time:")) {
                this.startTime = LocalDateTime.parse(line.substring("Game start time:".length()).trim());
            } else if (line.startsWith("Fill Count:")) {
                this.fillCount = Integer.parseInt(line.substring("Fill Count:".length()).trim());
            } else if (line.startsWith("remove Count:")) {
                this.removeCount = Integer.parseInt(line.substring("remove Count:".length()).trim());
            }
        }
        System.out.println("Game load!");
    }

    public LocalDateTime setStartTime() throws FileNotFoundException {
        this.startTime = LocalDateTime.now();
        saveToFile();
        return startTime;
    }
}
