import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Number: ");
      int a = sc.nextInt();
      
      // part a
      if (a % 3 == 0 || a % 5 == 0) {
          System.out.println("a. Yes");
      } else {
          System.out.println("a. No");
      }
      
      // part b
      if (a % 3 == 0 && a % 5 == 0) {
          System.out.println("b. Yes");
      } else {
          System.out.println("b. No");
      }
      
      // part c
      if (a % 3 == 0 && a % 5 != 0) {
          System.out.println("c. Yes");
      } else {
          System.out.println("c. No");
      }
      
      // part d
      if (a % 3 != 0 && a % 5 == 0) {
          System.out.println("d. Yes");
      } else {
          System.out.println("d. No");
      }
      
      // part e
      if ((a % 3 == 0) ^ (a % 5 == 0)) {
          System.out.println("e. Yes");
      } else {
          System.out.println("e. No");
      }
      
      // part f
      if (!(a % 3 == 0 || a % 5 == 0)) {
          System.out.println("f. Yes");
      } else {
          System.out.println("f. No");
      }
    }
}
