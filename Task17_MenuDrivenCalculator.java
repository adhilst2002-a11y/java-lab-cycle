import java.util.Scanner;

public class Task17_MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        int result;
        switch (choice) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.println("Result = " + result);
        sc.close();
    }
}
