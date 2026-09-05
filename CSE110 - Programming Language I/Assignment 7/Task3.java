import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int N = sc.nextInt();
        double[] arr = new double[N];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextDouble();
        }
        
        double min = arr[0];
        int min_index = 0;
        double max = arr[0];
        int max_index = 0;
        double sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min_index = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                max_index = i;
            }
            sum += arr[i];
        }
        
        double avg = sum / arr.length;
        
        System.out.println("Maximum element "+max+" found at index "+max_index);
        System.out.println("Minimum element "+min+" found at index "+min_index);
        System.out.println("Summation: "+sum);
        System.out.println("Average: "+avg);
    }
}
