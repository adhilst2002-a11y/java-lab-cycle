import java.util.Scanner;

public class Task20_SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                position = i + 1;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
