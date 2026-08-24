import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String sepLine = sc.nextLine();
        char sep = sepLine.charAt(0);
        text = text + sep; 
        System.out.println("The words are:");
        String cleaned = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == sep) {
                System.out.println(cleaned);
                cleaned = "";
            } else if (cleaned.indexOf(c) == -1) {
                cleaned += c;
            }
        }
    }
}
