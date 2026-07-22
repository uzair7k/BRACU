import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students to check: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            int value = 1;
            boolean Lucky = false;
            while (value <= id) {
                if (value == id) {
                    Lucky = true;
                    break;
                }
                value *= 2;
            }
            if (Lucky) {
                System.out.println("Lucky ID");
            } else {
                System.out.println("Not Lucky");
            }
        }
    }
}
