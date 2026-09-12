import java.util.Scanner;
public class Question2 {
    public static void StringCutter(String s, int n, boolean back) {
        if (back) {
            for (int i = 0; i < s.length() - n; i++) {
                System.out.print(s.charAt(i));
            }
        } else {
            for (int i = n; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter number of character: ");
        int n = sc.nextInt();
        System.out.print("From the back? (true/false): ");
        boolean back = sc.nextBoolean();
        StringCutter(s,n,back);
    }
}
