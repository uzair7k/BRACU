import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount the customer need to pay(Taka)");
		int due = sc.nextInt();
		System.out.println("Enter the amount, customer gave(Taka)");
		int handed = sc.nextInt();
		
		if (handed > due) {
			int change = handed - due;
            System.out.println("The returned amount is " + change + " taka.");
            int n100 = change / 100; change %= 100;
            int n50  = change / 50;  change %= 50;
            int n20  = change / 20;  change %= 20;
            int n10  = change / 10;  change %= 10;
            int c5   = change / 5;   change %= 5;
            int c2   = change / 2;   change %= 2;
            int c1   = change;
            
            System.out.println("100 taka note: " + n100);
            System.out.println("50 taka note: " + n50);
            System.out.println("20 taka note: " + n20);
            System.out.println("10 taka note: " + n10);
            System.out.println("5 taka coin: " + c5);
            System.out.println("2 taka coin: " + c2);
            System.out.println("1 taka coin: " + c1);
        } else if (handed < due) {
            System.out.println("Please pay " + (due - handed) + " taka more.");
        } else {
            System.out.println("The returned amount is 0 taka.");
        }
    }
}