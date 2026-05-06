package LogicalOperators;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT

        Scanner scanner = new Scanner(System.in);

        // Username must be between 4-12 characters
        // Username must no contain spaces or underscores

        String username;

        System.out.print("Enter a username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters.");
        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores.");
        }
        else {
            System.out.println("Username is valid.");
        }


        scanner.close();

        // double temp = -10;
        // boolean isSunny = true;

        // if(temp <= 30 && temp >= 0 && isSunny) {
        //     System.out.println("Temperature is within the valid range.");
        //     System.out.println("It's a sunny day.");
        // }
        // else if(temp <= 30 && temp >= 0 && !isSunny){
        //     System.out.println("Temperature is within the valid range.");
        //     System.out.println("It's not a sunny day.");
        // }
        // else if(temp > 30 || temp < 0) {
        //     System.out.println("Temperature is outside the valid range.");
        // }
        // else {
        //     System.out.println("Temperature is outside the valid range.");
        // }

    }
}
