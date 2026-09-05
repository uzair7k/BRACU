import java.util.Scanner;
public class Method_B {
    public static void evenPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        evenPositive(num);
    }
}
