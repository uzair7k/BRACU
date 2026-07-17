import java.util.Scanner;
public class UserInput_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
