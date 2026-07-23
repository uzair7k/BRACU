import java.util.Scanner;
public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Karim's Salary (x): ");
    int salary = sc.nextInt();
    double bonus = salary * 0.75;
    double total = bonus + salary;
    double wife = total * 0.45;
    double son = total * 0.45;
    double savings = total * 0.10;
    System.out.println("Amount with Bonus: " +total);
    System.out.println("Wife Budget: " +wife);
    System.out.println("Son Budget: " +son);
    System.out.println("Savings: " +savings);
    double laptop = 90000;
    double ps5 = 70000 + 7000;
    if (wife >= laptop) {
      wife -= laptop;
      System.out.println("Shopping Done for Wife!");
    } else if ((wife + son) >= laptop) {
      double needed = laptop - wife;
      wife = 0;
      son -= needed;
      System.out.println("Shopping Done for Wife with remaining money from Sons budget!");
    } else {
      System.out.println("Cannot do shopping for wife even with remaining money from his son's budget!");
        }
    if (son >= ps5) {
      son -= ps5;
      System.out.println("Shopping Done for Son!");
    } else if ((son + wife) >= ps5) {
      double needed = ps5 - son;
      son = 0;
      wife -= needed;
      System.out.println("Shopping Done for Son with remaining money from Wifes budget!");
    } else {
      System.out.println("Cannot do shopping for son even with remaining money from his wife's budget!");
    }
  }
}
