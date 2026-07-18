import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your numbers:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int ans = a;
      
      if (( a>b || a>c ) && !(a>b && a>c)) {
          ans = a;
      }
      if (( b>a || b>c ) && !(b>a && b>c)) {
          ans = b;
      }
      if (( c>b || c>a ) && !(c>b && c>a)) {
          ans = c;
      }
      
      System.out.println("Second largest is " + ans);
    }
}
