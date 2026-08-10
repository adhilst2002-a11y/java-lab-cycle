import java.util.Scanner;

public class Lab11 {
    static class Box {
        double width, height, depth;

        Box(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }

        double volume() {
            return width * height * depth;
        }
    }

    // Method that accepts two Box objects as parameters
    static void displayLargerVolume(Box b1, Box b2) {
        double vol1 = b1.volume();
        double vol2 = b2.volume();
        double larger = (vol1 > vol2) ? vol1 : vol2;

        // Print as integer if there's no fractional part, otherwise as double
        if (larger == (long) larger) {
            System.out.println("Larger Box Volume = " + (long) larger);
        } else {
            System.out.println("Larger Box Volume = " + larger);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Box1: ");
        double w1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        double d1 = sc.nextDouble();

        System.out.print("Box2: ");
        double w2 = sc.nextDouble();
        double h2 = sc.nextDouble();
        double d2 = sc.nextDouble();

        Box box1 = new Box(w1, h1, d1);
        Box box2 = new Box(w2, h2, d2);

        displayLargerVolume(box1, box2);

        sc.close();
    }
}
