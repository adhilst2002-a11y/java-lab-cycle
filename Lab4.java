import java.util.Scanner;

public class Lab4 {
    static class Student {
        String name;
        int age;

        // Parameterized constructor using 'this' to distinguish instance variables from local parameters
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Student Name : " + this.name + " Age : " + this.age);
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
