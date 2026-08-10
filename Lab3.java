import java.util.Scanner;

public class Lab3 {
    static class Rectangle {
        int length;
        int breadth;

        // Default constructor
        Rectangle() {
            this.length = 1;
            this.breadth = 1;
        }

        // Parameterized constructor
        Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        int getArea() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int len = sc.nextInt();
        System.out.print("Breadth: ");
        int bre = sc.nextInt();

        // Default constructor instance
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle 1 Area = " + r1.getArea());

        // Parameterized constructor instance
        Rectangle r2 = new Rectangle(len, bre);
        System.out.println("Rectangle 2 Area = " + r2.getArea());

        sc.close();
    }
}
