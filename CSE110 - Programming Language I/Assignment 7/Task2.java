import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        
        boolean found = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                index = i;
                break;
            }
        }
        
        if (found) {
            System.out.println(num + " is at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
