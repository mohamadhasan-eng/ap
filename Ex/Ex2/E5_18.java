package Ex.Ex2;

import java.util.Arrays;
import java.util.Scanner;

public class E5_18 {
    public static void main(String[] args) {
        System.out.println("Please enter three str:");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        String[] strings = {str1, str2, str3};
        Arrays.sort(strings);
        System.out.println("The string were sorted: ");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
