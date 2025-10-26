package Ex.Ex2;

public class E6_1_a {
    public static void main(String[] args) {
        System.out.println("E6.1 a");
        int res = 0;
        for (int i = 2; i <= 100; i+=2) {
            res += i;
        }
        System.out.println("Sum of all numbers between '2' and '100': " + res);
    }
}
