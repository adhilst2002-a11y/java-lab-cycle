import java.util.Scanner;

public class Lab20 {
    public static void main(String[] args) {
        // Declaring constant PI using final keyword
        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        double area = PI * radius * radius;
        
        // Print area formatted to 2 decimal places to match "Area = 78.54"
        System.out.printf("Area = %.2f\n", area);

        sc.close();
    }
}
