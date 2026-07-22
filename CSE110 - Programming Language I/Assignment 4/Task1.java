import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number of Weeks, W: ");
      int W = sc.nextInt();
      
      int STRL = 0;
      for (int i =1; i <= W; i++) {
          int SUM = 0;
          for (int j = 1; j <= i; j++) {
              SUM += j;
          }
          STRL -= SUM;
      }
      System.out.println("STRL = " + STRL);
    } 
}
