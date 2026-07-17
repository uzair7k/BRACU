import java.util.Scanner;
public class Task1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total time in minutes since the mission launch:");
		long minutes = sc.nextLong();
		long minutesInDay = 24 * 60;
		long minutesInYear = 365 * minutesInDay;
		long years = minutes / minutesInYear;
		long minutesRemaining = minutes % minutesInYear;
		long days = minutesRemaining / minutesInDay;
		System.out.println("Total time in years and days is " + years + " years and " + days + " days");
	}
}
