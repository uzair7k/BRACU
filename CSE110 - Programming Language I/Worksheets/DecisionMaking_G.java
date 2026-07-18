import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Marks: ");
      int marks = sc.nextInt();
      char grade;
      String comment;
      if (marks > 100 || marks < 0) {
          System.out.println("Invalid Input");
      } else {
          if (marks >= 80) {
              grade = 'A';
              comment = "Excellent";
          } else if (marks >= 70) {
              grade = 'B';
              comment = "Good";
          } else if (marks >= 60) {
              grade = 'C';
              comment = "Satisfactory";
          } else if (marks >= 50) {
              grade = 'D';
              comment = "Okay";
          } else {
              grade = 'F';
              comment = "Fail";
          }
          System.out.println("Grade: " + grade +" (" + comment + ")");
      }
    }
}
