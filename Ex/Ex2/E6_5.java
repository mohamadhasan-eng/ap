package Ex.Ex2;

import java.util.Arrays;
import java.util.Scanner;

public class E6_5 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("please enter the number of digits: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        float[] array = addDigits(k);
        average(k, array);
        sortMaxMin(k, array);
        range(k, array);
    }


    static float[] addDigits(int k) {
        Scanner scanner = new Scanner(System.in);
        float[] array = new float[k];
        System.out.println("please enter decimal digits: ");
        for (int i = 0; i < k; i++) {
            array[i] = scanner.nextFloat();
        }
        return array;
    }


    //بخش a
    static void average(int k, float[] array) {
        System.out.println("_________________________");
        System.out.println("Part a: ");
        float average = 0;
        for (int i = 0; i < k; i++) {
            average += array[i];
        }
        System.out.println("Average: " + average / k);
    }


    //بخش b و c
    static void sortMaxMin(int k, float[] array) {
        System.out.println("_________________________");
        System.out.println("Part b & c: ");
        Arrays.sort(array);
        System.out.println("Sorted array:");
        for (int i = 0; i < k; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Max num: " + array[k - 1] + ", Min num" + array[0]);
    }


    //بخش d
    static void range(int k, float[] array) {
        System.out.println("_________________________");
        System.out.println("Part d: ");
        float range = array[k - 1] - array[0];
        System.out.println("Range: " + range);
    }
}
