import java.util.Scanner;

public class Arrays_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("number of elements: ");
        int n = sc.nextInt();
        
        System.out.println("array 1: ");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("array 2: ");
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int[] common = new int[n];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2 [j]) {
                    
                    boolean alreadyAdded = false;
                    for (int k = 0; k < count; k++) {
                        if (common[k] == arr1[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    
                    if (!alreadyAdded) {
                        common[count] = arr1 [i];
                        count++;
                    }
                    
                    break;
                }
            }
        }
        
        System.out.println("common elements: ");
        for (int i = 0; i < count; i++) {
            System.out.println(common[i]);
        }
    }
}
