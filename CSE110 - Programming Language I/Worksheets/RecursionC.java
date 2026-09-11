public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, -3};
        System.out.println(sum(arr, arr.length - 1));
    }
    static int sum(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        return arr[index] + sum(arr, index - 1);
    }
}
