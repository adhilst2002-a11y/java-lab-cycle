import java.util.Scanner;

public class Lab13 {
    static class Circle {
        double radius;
        double area;

        Circle(double radius, double area) {
            this.radius = radius;
            this.area = area;
        }
    }

    // Method that calculates area and returns a Circle object
    static Circle computeCircle(double radius) {
        double area = Math.PI * radius * radius;
        return new Circle(radius, area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        Circle c = computeCircle(radius);
        
        // Format to match "Radius = 7.0 Area = 153.94"
        System.out.printf("Radius = %.1f Area = %.2f\n", c.radius, c.area);

        sc.close();
    }
}
