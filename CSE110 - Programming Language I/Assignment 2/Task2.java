import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Age: ");
		int age = sc.nextInt();
		System.out.println("Electricity consumed: ");
		double kWh = sc.nextDouble();
		
		double bill = kWh * 15;
		
		if (age < 18) {
			bill *= 0.80;
		} else if (age > 60) {
			bill *= 0.90;
		}
		
		if (kWh > 100) {
			bill *= 1.05;
		} 
		
		System.out.println("Final Bill: " + bill + " Taka");
	}
}
