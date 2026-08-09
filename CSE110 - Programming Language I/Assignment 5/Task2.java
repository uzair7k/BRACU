import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                int val = n - i + j;
                if (i == 1 || i == n || j == 1 || j == i) {
                    System.out.print(val);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
