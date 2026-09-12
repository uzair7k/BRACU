import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt()
        System.out.println(power(x,y));
        
    }
    public static int power(int b, int e) {
        if (e == 1) {
            return b;
        }
        return b * power(b, e - 1);
    }
}
