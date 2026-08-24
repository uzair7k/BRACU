import java.util.Scanner;
public class Array_B {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int m = arr[0];
        for (int i = 0; i < 5; i++) {
            if (arr[i] >= m) {
                m = arr[i];
            } 
        }
        System.out.println(m);
    }
}
