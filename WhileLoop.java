package WhileLoop;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // While loop = repeat some code forever while some condition is true

        // while(1 == 1){
        //     System.out.println("HELP");
        // }

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do{
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You entered: " + number);

        // int age = 0;
        // System.out.print("Please enter your age: ");

        // age = scanner.nextInt();

        // while(age < 0){
        //     System.out.println("Invalid age, please try again.");
        //     System.out.print("Please enter your age: ");
        //     age = scanner.nextInt();
        // }

        // do{
        //     System.out.println("Invalid age, please try again.");
        //     System.out.print("Please enter your age: ");
        //     age = scanner.nextInt();
        // }while(age < 0);

        // System.out.println("You are " + age + " years old.");
        // String response = "";

        // while(!response.equals("Q")) {
        //     System.out.print("Enter 'q' to quit: ");
        //     response = scanner.nextLine().toUpperCase();
        // }

        // System.out.println("Thank you for playing!");

        // String name = "";

        // while(name.isEmpty()){
        //     System.out.print("Please enter your name: ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Hello " + name);

        scanner.close();

    }
    
}
