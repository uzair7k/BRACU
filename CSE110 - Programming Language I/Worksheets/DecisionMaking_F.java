import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Working Hours: ");
      int hours = sc.nextInt();
      if (hours > 12 || hours <= 0) {
          System.out.println("Invalid");
      } else {
          if (hours > 10) {
              System.out.println("Salary: " + ((hours - 10)*300 + 2*250 + 8*200));
          } else if (hours > 8) {
              System.out.println("Salary: " + ((hours - 8)*250 + 8*200));
          } else {
              System.out.println("Salary: " + hours*200);
          }
      }
    }
}
