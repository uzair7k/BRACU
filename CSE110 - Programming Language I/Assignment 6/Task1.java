import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Message: ");
        String msg = sc.nextLine();

        int maxPin = 0;
        for (int i = 0; i < msg.length() - 1; i++) {
            char c1 = msg.charAt(i);
            char c2 = msg.charAt(i + 1);
            if (c1 >= '0' && c1 <= '9' && c2 >= '0' && c2 <= '9') {
                int value = (c1 - '0') * 10 + (c2 - '0');
                if (value > maxPin) {
                    maxPin = value;
                }
            }
        }

        System.out.println("2-Digit PIN: " + maxPin);
    }
}
