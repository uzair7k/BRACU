import java.util.Scanner;

public class Lab4 {
    public static String reverse_string(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }
        return reverse_string(s, idx + 1) + s.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse_string(s, 0));
    }
}
