import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while (n != 0) {
            int d = n % 10;
            n /= 10;
            if (n != 0) {
                System.out.print(d + ", ");
            } else {
                System.out.println(d);
            }
        }
    }
}
