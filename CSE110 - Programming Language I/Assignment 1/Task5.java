public class Task5 {
	public static void main(String[]args) {
		double a = 4.5;
		double b = 9.5;
		double c = Math.sqrt( a*a + b*b );
		double sinA = a/c;
		double cosA = b/c;
		double sinB = b/c;
		double cosB = a/c;
		System.out.println("SinA is " + sinA);
		System.out.println("CosA is " + cosA);
		System.out.println("SinB is " + sinB);
		System.out.println("CosB is " + cosB);
	}
}