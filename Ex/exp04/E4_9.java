package Ex.exp04;

import java.util.Scanner;

public class E4_9 {
    public static void main(String[] args) {
        System.out.println("String compression:");
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();


        String compress = "";
        int count = 1;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(i - 1)) {
                count++;
            } else {
                compress += string.charAt(i - 1) + "" + count;
                count = 1;
            }
        }
        compress += string.charAt(string.length() - 1) + "" + count;
        System.out.println("Compressed growth: " + compress);
    }
}