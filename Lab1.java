public class Lab1 {
    static class Student {
        // Default constructor
        Student() {
            System.out.println("Welcome to Student Class");
        }
    }

    public static void main(String[] args) {
        // Creating student object triggers the default constructor
        new Student();
    }
}
