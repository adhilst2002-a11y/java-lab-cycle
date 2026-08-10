import java.util.Scanner;

public class Lab14 {
    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println("Factorial = " + factorial(n));
        }
        sc.close();
    }
}
