import java.util.Arrays;
import java.util.Scanner;
public class Arrays_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
        System.out.println("array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (temp[j] == arr[i]) {
                    found = true;
                }
            }
            if (!found) {
                temp[count] = arr[i];
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
