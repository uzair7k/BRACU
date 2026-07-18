import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      int n = sc.nextInt();
      long factorial = 1;
      if (n > 0) {
          for (int i = 1; i <= n; i++) {
              factorial *= i;
          }
          System.out.println("Factorial: " + factorial);
      } else {
          System.out.println("Invalid Input");
      }
    }
}
