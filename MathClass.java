package MathClass;
import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);

        // double result;

        // result = Math.pow(2, 3);
        // result = Math.abs(-5);
        // result = Math.sqrt(9);
        // result = Math.round(3.14);
        // result = Math.ceil(3.14);
        // result = Math.floor(3.99);
        // result = Math.max(10, 20);
        // result = Math.min(10, 20);
        
        // System.out.println(result);

        //HYPOTENUSE c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Scanner scanner = new Scanner(System.in);

        // double a;
        // double b;
        // double c;

        // System.out.print("Enter the length of side a: ");
        // a = scanner.nextDouble();

        // System.out.print("Enter the length of side b: ");
        // b = scanner.nextDouble();

        // c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // System.out.println("The length of the hypotenuse is: " + c);

        // scanner.close();

        // Circumference of a circle = 2 * Math.PI * radius
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4/3) * Math.PI * Math.pow(radius, 3); 

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference: %.1fcm\n", circumference);
        System.out.printf("Area: %.1fcm\n", area);
        System.out.printf("Volume: %.1fcm\n", volume);

        scanner.close();
    }

}
