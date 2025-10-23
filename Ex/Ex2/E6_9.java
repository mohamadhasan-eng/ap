package Ex.Ex2;

import java.util.Scanner;

public class E6_9 {
    public static void main(String[] args) {
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println("Output: ");
        for (int i = string.length() - 1; i >= 0; i--) {
            char ch = string.charAt(i);
            System.out.print(ch);
        }
    }
}
