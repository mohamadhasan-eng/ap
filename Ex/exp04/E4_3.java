package Ex.exp04;

import java.util.Scanner;

public class E4_3 {
    public static void main(String[] args) {
        System.out.println("Finding non-repeating characters:");
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

int r = -1;
        for (int i = 0; i < string.length(); i++) {
            char ch1 = string.charAt(i);
            int count = 0;
            for (int j = 0; j < string.length(); j++) {
                if (ch1 == string.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Unrepeated word:");
                System.out.println(ch1);
                r = i;
                break;
            }
        }
        if (r == -1){
            System.out.println("not found unique word.");
        }
    }
}



