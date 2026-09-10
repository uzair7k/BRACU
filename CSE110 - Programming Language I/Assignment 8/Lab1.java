import java.util.Arrays;
import java.util.Scanner;

public class Lab1 {
    public static void evenChecker(int n) {
        if (n % 2 == 0) {
            System.out.println("Even!!");
        } else {
            System.out.println("Odd!!");
        }
    }
    
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
    
    public static boolean isPos(int n) {
        if (n > 0) {
            return true;
        }
        return false;
    }
    
    public static void sequence(int n) {
        if (isPos(n)) {
            for (int i = 0; i <= n; i++) {
                if (isEven(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = n; i < 0; i++) {
                if (!isEven(i)) {
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        evenChecker(10);
        evenChecker(17);
        boolean result1 = isEven(10);
        System.out.println(result1);
        boolean result2 = isEven(17);
        System.out.println(result2);
        boolean result3 = isPos(-5);
        System.out.println(result3);
        boolean result4 = isPos(12);
        System.out.println(result4);
        sequence(10);
        sequence(-7);
        sequence(7);
        sequence(-8);
    }
}
