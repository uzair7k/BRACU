import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Code: ");
        String code = sc.nextLine();
        String result = "";
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                result += (char) (c + 32);
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result += (char) (c - 32);
            } else {
                result += c;
            }
        }

        System.out.println("Redeemable Code: " + result);
    }
}
