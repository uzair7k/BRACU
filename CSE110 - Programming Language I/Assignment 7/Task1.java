import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] modified = new int[N];
        for(int i = 0; i < modified.length; i++) {
            if (arr[i] > 0) {
                modified[i] = 1;
            } else {
                modified[i] = 0;
            }
        }
        
        System.out.println("After modifying:");
        for(int i = 0; i < modified.length; i++) {
            System.out.print(modified[i] + " ");
        }
    }
}
