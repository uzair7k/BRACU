import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    while (a >= b) {
      a -= b;
      count++;
    }
    System.out.println("a % b: " + a + " and a / b: " + count);
  }
}
