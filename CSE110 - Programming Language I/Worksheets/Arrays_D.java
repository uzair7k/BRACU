import java.util.Scanner;
public class Array_C {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Target: ");
        int n = sc.nextInt();
        System.out.println("Array: ");
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Boolean found = false;
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == n) {
                found = true;
                index = i;
            } 
        }
        if (found) {
            System.out.println("Target element is at index: " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
