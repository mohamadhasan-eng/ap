package Ex.exp04;

import java.util.Scanner;

public class E4_5 {
    public static void main(String[] args) {
        System.out.println("Sum of digits in a string:");
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= '0' && ch <= '9'){
                sum += ch - '0';
            }
        }
        System.out.println("sum of digits: " + sum);
    }
}
