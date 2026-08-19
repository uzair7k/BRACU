import java.util.Scanner;
public class String_B {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;    
            }
        }
        System.out.println(count);
    }
}
