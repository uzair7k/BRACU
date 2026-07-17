public class Task3 {
	public static void main(String[]args) {
		int studentID = 1000054943;
		int d1 = studentID % 10;
		int d2 = (studentID / 10) % 10;
		System.out.println(d1 + " " + d2);
	}
}