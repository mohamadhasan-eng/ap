package Ex.Ex2;

public class E6_16 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Multiplication table:");
        int[][] multiTable = new int[10][10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiTable[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(multiTable[i][j] + "\t");
            }
            System.out.println();
        }
    }
}