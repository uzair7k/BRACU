import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        double[] x_coordinates = {0.39, 0.72, 1.00, 1.52, -5.20};
        double[] y_coordinates = {0.24, 0.00, 0.00, 0.99, 2.86};
        double[] z_coordinates = {-0.10, 0.44, -0.02, 0.21, 0.42};
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int inputIndex = -1;
        for (int i = 0; i < planets.length; i++) {
            if (planets[i].equals(input)) {
                inputIndex = i;
            }
        }
        
        if (inputIndex == -1) {
            System.out.println("Invalid Input");
        } else {
            double x0 = x_coordinates[inputIndex];
            double y0 = y_coordinates[inputIndex];
            double z0 = z_coordinates[inputIndex];
            
            double closestDistance = -1;
            int closestIndex = -1;
            for (int i = 0; i < planets.length; i++) {
                if (i != inputIndex) {
                    double distance = Math.pow(x_coordinates[i] - x0, 2) + Math.pow(y_coordinates[i] - y0, 2) + Math.pow(z_coordinates[i] - z0, 2);
                    
                    if (closestIndex == -1 || distance < closestDistance) {
                        closestDistance = distance;
                        closestIndex = i;
                    }
                }
            }
            
            System.out.println("Closest Planet : " + planets[closestIndex]);
            System.out.println("Distance : " + closestDistance);
        }
    }
}
