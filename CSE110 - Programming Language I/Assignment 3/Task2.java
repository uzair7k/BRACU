import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter number of Herbs (H): ");
        int H = sc.nextInt();
        System.out.print("Please Enter number of Crystals (C): ");
        int C = sc.nextInt();
        int P = 0;
        
        while (H >= 3 && C >= 2) {
            H -= 3;
            C -= 2;
            P++;
            System.out.println("Potions-" + P + " created");
            System.out.println("Remaining Herbs: " + H + ", Remaining Crystals: " + C);
        }
        
        if (P % 2 == 0) {
            System.out.println("Stable Elixir");
        } else {
            System.out.println("Volatile Brew");
        }
    }
}
