import java.util.Scanner;

class Counter {
    // Static variable to keep track of instance count
    static int count = 0;

    Counter() {
        count++;
    }
}

public class Lab18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3; // Default fallback count

        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else if (sc.hasNextLine()) {
            String input = sc.nextLine();
            // Strip out non-numeric characters to extract digits from "Create 3 objects"
            String digits = input.replaceAll("[^0-9]", "");
            if (!digits.isEmpty()) {
                n = Integer.parseInt(digits);
            }
        }

        // Instantiate objects
        for (int i = 0; i < n; i++) {
            new Counter();
        }

        System.out.println("Objects Created : " + Counter.count);
        sc.close();
    }
}
