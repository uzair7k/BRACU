import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fan Message: ");
        String msg = sc.nextLine();
        String lower = msg.toLowerCase();

        int madridCount = 0;
        int index = lower.indexOf("madrid");
        while (index != -1) {
            madridCount++;
            index = lower.indexOf("madrid", index + 1);
        }

        int bayernCount = 0;
        index = lower.indexOf("bayern");
        while (index != -1) {
            bayernCount++;
            index = lower.indexOf("bayern", index + 1);
        }

        if (madridCount > bayernCount) {
            System.out.println("Madrid Supporter");
        } else if (bayernCount > madridCount) {
            System.out.println("Bayern Supporter");
        } else {
            System.out.println("Neutral");
        }

        if (lower.indexOf("close") != -1) {
            System.out.println("Fan expect a close match");
        } else if (lower.indexOf("destroy") != -1) {
            System.out.println("Fan expects a dominating victory!");
        } else {
            System.out.println("Hard to read the fan sentiment");
        }
    }
}
