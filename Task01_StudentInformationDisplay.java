import java.util.Scanner;

public class Task01_StudentInformationDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        System.out.print("Percentage: ");
        double percentage = sc.nextDouble();

        System.out.println();
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);

        sc.close();
    }
}
