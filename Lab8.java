import java.util.Scanner;

public class Lab8 {
    static class OverloadDemo {
        // Overloaded method for integer
        void display(int num) {
            System.out.print("Integer : " + num + " ");
        }

        // Overloaded method for double
        void display(double num) {
            System.out.print("Double : " + num + " ");
        }

        // Overloaded method for String
        void display(String str) {
            System.out.print("String : " + str + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Integer: ");
        int iVal = sc.nextInt();
        System.out.print("Double: ");
        double dVal = sc.nextDouble();
        
        // Consume newline character left by nextDouble()
        sc.nextLine();
        
        System.out.print("String: ");
        String sVal = sc.nextLine();

        OverloadDemo demo = new OverloadDemo();
        demo.display(iVal);
        demo.display(dVal);
        demo.display(sVal);
        System.out.println(); // Complete the line of output

        sc.close();
    }
}
