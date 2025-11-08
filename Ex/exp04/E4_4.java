package Ex.exp04;

import java.util.Scanner;

public class E4_4 {
    public static void main(String[] args) {
        System.out.println("Swapping lowercase letters with uppercase ones:");
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String res = "";


        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                res += (char)(ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                res += (char)(ch + 32);
            }else {
                res += ch;
            }
        }
        System.out.println("result: " + res);
    }
}
