package Ex.Ex2;

import java.util.Scanner;

public class E6_1_e {
    public static void main(String[] args) {
        System.out.println("E6.1 e");
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int r = 0;
        int res = 0;
        while (num != 0) {
            r = num % 10;
            num = num / 10;
            if (r % 2 != 0) {
                res += r;
            }
        }
        System.out.println("the sum of the odd digits of this number is: " + res);
    }
}
