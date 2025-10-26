package Ex.Ex2;

import java.util.Scanner;

public class E5_15 {
    public static void main(String[] args) {
        System.out.println("Ex5.15");
        System.out.println("Please enter your income: ");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();


        if (income < 50000) {
            System.out.println("You are not including taxes.");
        } else if (income == 50000) {
            System.out.println("Your tax will be: " + income * 1 / 100 + "$");
        } else if (income > 50000 && income <= 75000) {
            System.out.println("Your tax will be:" + income * 2 / 100 + "$");
        } else if (income > 75000 && income <= 100000) {
            System.out.println("Your tax will be: " + income * 3 / 100 + "$");
        } else if (income > 100000 && income <= 250000) {
            System.out.println("Your tax will be: " + income * 4 / 100 + "$");
        } else if (income > 250000 && income <= 500000) {
            System.out.println("Your tax will be: " + income * 5 / 100 + "$");
        } else {
            System.out.println("Your tax will be: " + income * 6 / 100 + "$");
        }
    }
}
