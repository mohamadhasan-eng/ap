package Ex.Ex2;

import java.util.Scanner;

public class E6_13 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Please enter a decimal number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Binary equivalent of number:");
        while (num != 0){
            int r = num % 2;
            num /= 2;
            System.out.println(r);
        }
    }
}
