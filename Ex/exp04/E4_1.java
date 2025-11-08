package Ex.exp04;

import java.util.Scanner;

public class E4_1 {
    public static void main(String[] args) {
        System.out.println("Word counter: ");
        System.out.println("Please enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Please enter the word you want to repeat: ");
        char ch = scanner.next().charAt(0);
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch2 = s.charAt(i);
            if (ch == ch2) {
                counter++;
            }
        }
        System.out.println("Word: " + ch + ", Number of repetitions:" + counter);
    }
}
