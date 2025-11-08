package Ex.exp04;

import java.util.Scanner;

public class E4_8 {
    public static void main(String[] args) {
        System.out.println("longest non-repeating string:");
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();


        String s = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String current = string.substring(i, j);
                boolean h = false;

                for (int k = 0; k < current.length(); k++) {
                    for (int l = k + 1; l < current.length(); l++) {
                        if (current.charAt(k) == current.charAt(l)) {
                            h = true;
                            break;
                        }
                    }
                    if (h)
                        break;
                }
                if (!h && current.length() > s.length()) {
                    s = current;
                }
            }
        }
        if (s.length() > 0) {
            System.out.println("longest: " + s);
            System.out.println("Length:" + s.length());
        } else {
            System.out.println("The string is empty.");
        }
    }
}
