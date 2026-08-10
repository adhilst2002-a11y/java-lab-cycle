import java.util.Scanner;

public class Lab10 {
    static class Student {
        String name;
        int rollNo;

        Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }
    }

    // Method that takes a Student object as an argument
    static void displayDetails(Student s) {
        System.out.println("Student Name : " + s.name + " Roll No : " + s.rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();

        Student std = new Student(name, rollNo);
        displayDetails(std); // Passing object to the method

        sc.close();
    }
}
