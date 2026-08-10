import java.util.Scanner;

public class Lab15 {
    // Recursive method to calculate the sum of the first n natural numbers
    static int sum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println("Sum = " + sum(n));
        }
        sc.close();
    }
}
