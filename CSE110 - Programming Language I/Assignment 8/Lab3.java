import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
    public static boolean isTriangle(int a, int b, int c) {
        if (a+b>c && a+c>b && b+c>a) {
            return true;
        }
        return false;
    }
    
    public static void triArea(int a, int b, int c) {
        double s = (a+b+c)/2;
        if (isTriangle(a,b,c)) {
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
        } else {
            System.out.println("Can't form triangle");
        }
    }
    
    public static void main(String[] args) {
        boolean res1 = isTriangle(7,5,10);
        System.out.println(res1);
        boolean res2 = isTriangle(3,2,1);
        System.out.println(res2);
        triArea(3,2,1);
        triArea(7,5,10);
    }
}
