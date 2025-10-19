package Ex.Ex2;

import java.util.Scanner;

public class E5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Plese enter a number: ");
            double number = scanner.nextDouble();
            if (number == 0) {
                System.out.println("Number: Zero");
            } else {
                if (number > 0) {
                    System.out.println("Number is positive.");
                } else {
                    System.out.println("Number is negative.");
                }
                if (Math.abs(number) < 1) {
                    System.out.println("Number is small.");
                } else if (Math.abs(number) > 1000000) {
                    System.out.println("Number is large.");
                }
            }
            System.out.println("Do you intend to continue?(yes=1, no=0)");
            int answer = scanner.nextInt();
            if (answer == 0) {
                break;
            }
        }
    }
}
