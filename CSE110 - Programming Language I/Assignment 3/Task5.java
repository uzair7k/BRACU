import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N-digit vault code: ");
        int code = sc.nextInt();
        int count = 0;
        int temp = code;
        
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        
        int divider = 1;
        for (int i = 1; i <= count - 1; i++) {
            divider *= 10;
        }
        
        temp = code;
        for (int i = 1; i <= count; i++) {
            int digit = temp / divider;
            System.out.print(digit + "... ");
            temp = temp % divider;
            divider = divider / 10;
        }
    }
}
