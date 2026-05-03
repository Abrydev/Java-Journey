package IfStatements;
import java.util.Scanner;


public class IfStatements {
    // if statements = a basic form of decision making
    // if a condition is true, then do something
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        //group 1
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name");
        }else{
            System.out.println("Hello " + name);
        }

        //group 2
        if (age >= 65){
            System.out.println("You are a senior citizen");
        } 
        else if (age >= 18) {
            System.out.println("You are an adult!");
        }
        else if (age < 0) {
            System.out.println("You haven't been born yet");
        }
        else if (age == 0){
            System.out.println("You are a baby");
        }
        else {
            System.out.println("You are a child");

        }

        //group 3
        if (isStudent) {
            System.out.println("You are a student");
        }
         else {
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}
