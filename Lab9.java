import java.util.Scanner;

public class Lab9 {
    static class ShapeArea {
        // Overloaded method for square area
        int area(int side) {
            return side * side;
        }

        // Overloaded method for rectangle area
        int area(int length, int breadth) {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side: ");
        int side = sc.nextInt();
        System.out.print("Length: ");
        int length = sc.nextInt();
        System.out.print("Breadth: ");
        int breadth = sc.nextInt();

        ShapeArea sa = new ShapeArea();
        int sqArea = sa.area(side);
        int rectArea = sa.area(length, breadth);

        System.out.println("Area of Square = " + sqArea + " Area of Rectangle = " + rectArea);
        
        sc.close();
    }
}
