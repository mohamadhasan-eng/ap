package Ex.Ex2;

import java.util.Arrays;
import java.util.Scanner;

public class E6_2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Please enter the length of the sequence(k): ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] array = new int[k];
        System.out.println("Please enter a sequence of numbers: ");

        for (int i = 0; i < k; i++) {
            array[i] = scanner.nextInt();
        }

        //بخش a
        System.out.println("_______________________________________");
        System.out.println("Part a:");
        Arrays.sort(array);
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("Max num: " + array[k - 1] + ", Min num: " + array[0]);

        //بخش b
        System.out.println("_______________________________________");
        System.out.println("Part b:");
        int even = 0;
        int odd = 0;
        for (int i = 0; i < k; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even numbers: " + even + ", odd numbers: " + odd);

        //بخش c
        System.out.println("_______________________________________");
        System.out.println("Part c: ");
        System.out.println("sum: ");
        int s = array[0];
        for (int i = 1; i < k; i++) {
            int sum = s + array[i];
            s = sum;
            System.out.println(sum);
        }

        //بخش d
        System.out.println("_______________________________________");
        System.out.println("Part d: ");
        System.out.println("Duplicate digit:");
        int n = 0;
        int m = 0;
        for (int i = 1; i < k; i++) {
            if (n != array[m]) {
                if (array[m] == array[i]) {
                    n = array[i];
                    m++;
                    System.out.println(n);
                } else {
                    m++;
                }
            } else {
                m++;
            }
        }
    }
}
