import java.util.Scanner;

class TemperatureConverter {
    // Static method for conversion
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

public class Lab19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius: ");
        double celsius = sc.nextDouble();

        // Calling static method without creating an instance of the class
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println("Fahrenheit = " + fahrenheit);

        sc.close();
    }
}
