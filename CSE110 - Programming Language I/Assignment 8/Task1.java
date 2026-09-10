import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (n == sum) {
            return true;
        }
        return false;
    }
    
    public static int special_sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (isPrime(i) || isPerfect(i)) {
                sum += i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        boolean check1 = isPrime(7);
        System.out.println(check1);
        boolean check2 = isPrime(15);
        System.out.println(check2);
        boolean check3 = isPerfect(6);
        System.out.println(check3);
        boolean check4 = isPerfect(33);
        System.out.println(check4);
        int result = special_sum(8);
        System.out.println(result);
    }
}
