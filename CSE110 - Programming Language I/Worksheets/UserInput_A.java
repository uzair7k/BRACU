import java.util.Scanner;
public class UserInput_A {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String lastName = sc.nextLine();
      System.out.println("This user's last name is " + lastName);
    }
}