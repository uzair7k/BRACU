import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount: ");
        int N = sc.nextInt();
        double sum = 0;
        System.out.println("Values: ");
        for (int i = 1; i <= N; i++) {
            int n = sc.nextInt();
            sum += n;
        }
        double avg = sum / (N *1.0);
        System.out.println("Average: " + avg);
    }
}
