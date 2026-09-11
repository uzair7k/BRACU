import java.util.Arrays;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("oneToN");
        oneToN(n);
        System.out.println();
        System.out.println("nToOne");
        nToOne(n);
        System.out.println();
        System.out.println("recursiveSum");
        System.out.println(recursiveSum(n));
    }
    public static void oneToN(int n) {
        if (n == 0) {
            return;
        }
        oneToN(n - 1);
        System.out.print(n + " ");
    }
    public static void nToOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        nToOne(n - 1);
    }
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }
}
