import java.util.Scanner;

public class Lab12 {
    static class Student {
        String name;
        int mark;

        Student(String name, int mark) {
            this.name = name;
            this.mark = mark;
        }
    }

    // Method that returns a Student object
    static Student createStudent(String name, int mark) {
        return new Student(name, mark);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Mark: ");
        int mark = sc.nextInt();

        // Get the Student object from the method
        Student std = createStudent(name, mark);
        
        System.out.println("Student Name : " + std.name + " Mark : " + std.mark);

        sc.close();
    }
}
