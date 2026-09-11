public class RecursionA {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, -3};
        System.out.println(min(arr, arr.length - 1));
    }
    static int min(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        int minOfRest = min(arr, index - 1);
        if (arr[index] < minOfRest) {
            return arr[index];
        } else {
            return minOfRest;
        }
    }
}
