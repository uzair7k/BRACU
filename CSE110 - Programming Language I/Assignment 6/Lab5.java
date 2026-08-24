import java.util.Scanner;
public class LabQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Upside Down: ");
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '^') {
                result += 'v';
            } else if (c == '3') {
                result += 'e';
            } else if (c == '@') {
                result += 'a';
            } else if (c == '_') {
                result += ' ';
            } else if (c == 'z') {
                result += 'a';
            } else {
                result += (char) (c + 1);
            }
        }
        System.out.println("Hawkins: " + result);
    }
}
