import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Members: ");
        int members = sc.nextInt();
        for (int m = 1; m <= members; m++) {
            System.out.print("Exercises for Member-" + m + ": ");
            int e = sc.nextInt();
            double top1 = 0, top2 = 0, top3 = 0;
            for (int i = 1; i <= e; i++) {
                System.out.print("Exercise-" + i + ": ");
                double v = sc.nextDouble();
                if (v > top1) {
                    top3 = top2;
                    top2 = top1;
                    top1 = v;
                } else if (v > top2) {
                    top3 = top2;
                    top2 = v;
                } else if (v > top3) {
                    top3 = v;
                }
            }
            int count = Math.min(e, 3);
            double rawSum = top1 + top2 + top3;
            double rawAvg = rawSum / count;
            double adjustedSum = rawSum;
            if (count >= 1 && top1 > 350) adjustedSum += top1 * 0.5;
            if (count >= 2 && top2 > 350) adjustedSum += top2 * 0.5;
            if (count >= 3 && top3 > 350) adjustedSum += top3 * 0.5;
            boolean allBelow200 = true;
            if (count >= 1 && top1 >= 200) allBelow200 = false;
            if (count >= 2 && top2 >= 200) allBelow200 = false;
            if (count >= 3 && top3 >= 200) allBelow200 = false;
            if (allBelow200) {
                adjustedSum -= rawSum * 0.10;
            }
            if (rawAvg > 400) {
                adjustedSum += 50 * count;
            }
            double finalAvg = adjustedSum / count;
            System.out.printf("Average calories earned per day for Member-%d: %.3f%n", m, finalAvg);
            if (e > 3) {
                System.out.println("(Can't do more than 3 exercise)");
            }
        }
    }
}
