package TemperatureConverter;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Temperature;
        double newTemperature;
        String unit;


        System.out.print("Enter the temperature: ");
        Temperature = scanner.nextDouble();

        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit): ");
        unit = scanner.next().toUpperCase();

        // (condition) ? isTrue : isFalse;
        newTemperature = (unit.equals("C")) ? (Temperature - 32) * 5 / 9 :  (Temperature * 5 / 9) + 32;

        System.out.printf("%.1f%s", newTemperature, unit);
        scanner.close();
    }
}
