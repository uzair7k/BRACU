import java.util.Arrays;
import java.util.Scanner;
public class Arrays_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
        System.out.println("array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] rev = new int[n];
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            rev[count] = arr[i];
            count++;
        }
        System.out.println(Arrays.toString(rev));
    }
}
