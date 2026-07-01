import java.util.Scanner;

public class Task12_StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        char grade;
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks <= 89) {
            grade = 'B';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Grade = " + grade);
        sc.close();
    }
}
