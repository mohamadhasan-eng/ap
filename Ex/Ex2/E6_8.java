package Ex.Ex2;

import java.util.Scanner;

public class E6_8 {
    public static void main(String[] args) {
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println("Output: ");
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            System.out.println(ch);
        }
    }
}
