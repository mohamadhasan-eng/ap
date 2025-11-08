package Ex.exp04;

import java.util.Scanner;

public class E4_6 {
    public static void main(String[] args) {
        System.out.println("Remove consecutive duplicate characters:");
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();


        String s = "";
        s += string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            char ch = string.charAt(i);
            char ch1 = string.charAt(i - 1);
            if (ch != ch1) {
                s += ch;
            }
        }
        System.out.println("Result: " + s);
    }
}
