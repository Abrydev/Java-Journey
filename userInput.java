package UserInput;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double width = 0;
        double height = 0;
        double area = 0;
        
        System.out.print("enter the width: ");
        width = scanner.nextDouble();

        System.out.print("enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("the area of the rectangle is: " + area + " cm");

        // System.out.print("enter your name: ");
        // String name = scanner.nextLine();

        // System.out.print("enter your age: ");
        // int age = scanner.nextInt();

        // System.out.print("enter your gpa: ");
        // double gpa = scanner.nextDouble();

        // System.out.println("Hello " + name);
        // System.out.println("you are " + age + " years old");
        // System.out.println("next year, you will be " + (age + 1) + " years old");
        // System.out.println("your gpa is " + gpa);

        scanner.close();

    }
}

