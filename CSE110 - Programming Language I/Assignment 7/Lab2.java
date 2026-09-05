import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Reversed using a new array:");
        int[] rev = new int[N];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(rev[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Reversed the original array: ");
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
