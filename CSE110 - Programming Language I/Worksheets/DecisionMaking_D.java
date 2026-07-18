import java.util.Scanner;
public class DecisionMaking_D {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your numbers:");
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int n4 = sc.nextInt();
      int largest = n1;
      if (n2 > largest) {
          largest = n2;
      }
      if (n3 > largest) {
          largest = n3;
      } 
      if (n4 > largest) {
          largest = n4;
      }
      System.out.println("Largest number is " + largest);
    }
}   
