import java.util.Scanner;

public class Task05_EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double da = 0.10 * basicSalary;
        double hra = 0.15 * basicSalary;
        double grossSalary = basicSalary + da + hra;

        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);

        sc.close();
    }
}
