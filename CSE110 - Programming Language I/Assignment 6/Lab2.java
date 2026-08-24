import java.util.Scanner;
public class Lab2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String1: ");
        String s1 = sc.nextLine();
        System.out.print("String2: ");
        String s2 = sc.nextLine();
        int length = 0;
        if (s1.length() <= s2.length()) {
            length = s1.length() - 1;
        } else { 
            length = s2.length() - 1;
        }
        String prefix = "";
        for (int i = 0; i <= length; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 == c2) {
                prefix += c1;
            } else {
                break;
            }
        }
        if (prefix.length() > 0) {
            System.out.println(prefix);
        } else {
            System.out.println("There is no common prefix between the input strings");
        }
    }
}
