import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter a number: ");
            arr1[i] = sc.nextInt();
        }
        //
        System.out.println("The elements of the array are:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i + ": " + arr1[i]);
        }
        //
        System.out.println("Enter another number: ");
        int k = sc.nextInt();
        int[] arr2 = new int[arr1.length + 1];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr2.length - 1] = k;
        //
        System.out.println("After resizing the array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
