package WeightConverter;
import java.util.Scanner;

public class WeightConverter {
    // weight converter
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  Declare Variables
        double weight;
        double newWeight;
        int choice;

        //  Welcome Message
        System.out.print("Weight Conversion Program\n");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        //  Prompt for use input Choice
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        //  option 1 convert lbs to kgs
        if(choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45359237;
            System.out.printf("%.2f lbs is equal to %.2f kgs\n", weight, newWeight);
        //  option 2 convert kgs to lbs
        }else if(choice == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 0.45359237;
            System.out.printf("%.2f kgs is equal to %.2f lbs\n", weight, newWeight);
        //  option 3 exit if choice is invalid
        }else {
            System.out.println("Invalid choice. Please enter 1 or 2.");

    }
    scanner.close();
    
    }
}
