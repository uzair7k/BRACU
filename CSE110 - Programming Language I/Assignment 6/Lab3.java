import java.util.Scanner;
public class Lab3 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("text: ");
        String text = sc.nextLine();
        System.out.print("startIndex: ");
        int startIndex = sc.nextInt();
        System.out.print("endIndex: ");
        int endIndex = sc.nextInt();
        String result = "";
        for (int i = startIndex; i <= endIndex; i++) {
            result += text.charAt(i);
        }
        System.out.println(result);
    }
}
