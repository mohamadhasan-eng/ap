package Ex.exp04;

import java.util.Scanner;

public class E4_10 {
    public static void main(String[] args) {
        System.out.println("All substring:");
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();


        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                String substring = string.substring(i,j);
                count++;
                System.out.println("count: " + count + ",  substring: " + substring);
            }
        }
        System.out.println("All substring count: " + count);
    }
}
