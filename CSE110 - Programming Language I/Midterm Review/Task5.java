import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN code: ");
        int pin = sc.nextInt();
        System.out.println("Frequency of digits:");
        for (int digit = 0; digit <= 9; digit++) {
            int freq = 0;
            int temp = pin;
            if (temp == 0 && digit == 0) {
                freq = 1;
            } else {
                while (temp > 0) {
                    int lastDigit = temp % 10;
                    if (lastDigit == digit) {
                        freq++;
                    }
                    temp = temp / 10;
                }
            }
            System.out.println(digit + ": " + freq);
        }
    }
}
