import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Energy (E): ");
        int E = sc.nextInt();
        System.out.print("Number of River (N): ");
        int N = sc.nextInt();
        boolean tired = false;
        
        for (int i = 1; i <= N; i++) {
            System.out.print("Enter River Distance D" + i + ": ");
            int D = sc.nextInt();
            if (D <= 5) {
                E -= 2;
            } else {
                E -= D / 2;
            }
            if (E < 0) {
                System.out.println("Tired at River " + i);
                tired = true;
                break;
            }
        }
        
        if (!tired) {
            System.out.println("All Done");
            System.out.println(E + " energy Left");
        }
    }
}
