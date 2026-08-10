import java.util.Scanner;

public class Lab16 {
    // Recursive method to find the nth Fibonacci number
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println("Fibonacci Number = " + fibonacci(n));
        }
        sc.close();
    }
}
