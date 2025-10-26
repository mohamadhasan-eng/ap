package Ex.Ex2;

import java.util.Scanner;

public class E6_3 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        //بخش a
        System.out.println("______________________________");
        System.out.println("Part a: ");
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.println("Uppercase letter in the string: " + ch);
            }
        }

        //بخش b
        System.out.println("______________________________");
        System.out.println("part b: ");
        String secondLetters = "";
        for (int i = 1; i < string.length(); i += 2) {
            secondLetters += string.charAt(i);
        }
        System.out.println("secondLetters = " + secondLetters);

        //بخش c
        System.out.println("______________________________");
        System.out.println("Part c: ");
        System.out.println("Without vowels: " + string.replaceAll("[aeiouAEIOU]", "_"));

        //بخش d
        System.out.println("______________________________");
        System.out.println("Part d: ");
        String vowels = string.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Number of vowels:" + vowels.length());

        //بخش e
        System.out.println("______________________________");
        System.out.println("Part e: ");
        System.out.println("Vowels position: ");
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if ("aeiouAEIOU".contains(String.valueOf(ch))) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
