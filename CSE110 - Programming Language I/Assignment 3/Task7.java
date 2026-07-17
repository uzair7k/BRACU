public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 600; i++) {
            boolean div7 = (i % 7 == 0);
            boolean div9 = (i % 9 == 0);
            if (div7 != div9) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
