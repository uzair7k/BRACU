import java.util.Scanner;
public class Strings_C {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPalidrome = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isPalidrome = false;
                break;
            }
        }
        if (isPalidrome) {
            System.out.println("Palidrome");
        } else {
            System.out.println("Not Palidrome");
        }
    }
}
