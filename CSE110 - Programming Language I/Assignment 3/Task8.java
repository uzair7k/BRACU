import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int pos = 0, neg = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            if (num >= 0) {
                pos++;
            } else {
                neg++;
            }
        }
        System.out.println(pos + " Non-negative Numbers");
        System.out.println(neg + " Negative Numbers");
    }
}
