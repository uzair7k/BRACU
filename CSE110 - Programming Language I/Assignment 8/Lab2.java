import java.util.Arrays;
import java.util.Scanner;

public class Lab2 {
    public static double circleArea(int r) {
        return r * r * Math.PI;
    }
    
    public static double sphereVolume(double r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
    
    public static void findSpace(int d, String s) {
        if (s == "circle") {
            System.out.println(circleArea(d/2));
        } else if (s == "sphere") {
            System.out.println(sphereVolume(d/2));
        } else {
            System.out.println("Wrong Parameter");
        }
    }
    
    public static void main(String[] args) {
        double area = circleArea(5);
        System.out.println(area);
        double volume = sphereVolume(5.0);
        System.out.println(volume);
        findSpace(10,"circle");
        findSpace(5,"sphere");
        findSpace(10,"square");
    }
}
