import java.util.Scanner;

public class Lab5 {
    static class Student {
        String name;
        int age;

        // Default constructor
        Student() {
            System.out.println("Default Constructor");
        }

        // Parameterized constructor invoking default constructor using this()
        Student(String name, int age) {
            this(); // Invokes default constructor first
            this.name = name;
            this.age = age;
            System.out.println("Parameterized Constructor");
        }

        void display() {
            System.out.println("Name : " + name + " Age : " + age);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();

        Student student = new Student(name, age);
        student.display();
        sc.close();
    }
}
