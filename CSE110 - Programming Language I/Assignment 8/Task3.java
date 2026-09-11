import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static double calcTax(double age, double salary) {
        double tax = 0;
        if (age < 18 || salary < 10000) {
            return tax;
        } else if (salary <= 20000) {
            tax = salary * 0.07;
            return tax;
        } else {
            tax = salary * 0.14;
            return tax;
        }
    }
    
    public static void calcYearlyTax() {
        Scanner sc = new Scanner(System.in);
        double age = sc.nextInt();
        double totalTax = 0;
        for(int i = 1; i <= 12; i++) {
            double salary = sc.nextInt();
            double tax = calcTax(age,salary);
            totalTax += tax;
            System.out.println("Month"+i +"tax: " + tax);
        }
        System.out.println("Total Yearly Tax: " + totalTax);
    }
    
    public static void main(String[] args) {
        calcYearlyTax();
    }
}
