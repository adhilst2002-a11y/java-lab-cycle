import java.util.Scanner;

public class Lab17 {
    static class Student {
        // Private data members
        private String name;
        private int age;

        // Public getter and setter for name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Public getter and setter for age
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();

        Student std = new Student();
        // Accessing private variables using public setters
        std.setName(name);
        std.setAge(age);

        // Accessing private variables using public getters
        System.out.println("Student Name : " + std.getName() + " Age : " + std.getAge());

        sc.close();
    }
}
