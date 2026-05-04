// Challenge: Weight Converter My own Code
// Before watching video

package ChallengeWeightConverter;
import java.util.Scanner;
public class ChallengeWeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int option;

        System.out.println("Welcome to the Weight Converter!");
        System.out.println("1. Convert from Pounds to Kilograms");
        System.out.println("2. Convert from Kilograms to Pounds");
        System.out.print("Please select an option (1 or 2): ");
        option = scanner.nextInt();
        scanner.nextLine(); 
        

        //option 1
        if (option == 1){
            System.out.print("Please enter the weight you want to convert (Lbs): ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The weight in kilograms is: %.2f%n", newWeight);
        }
        //option 2
        else if (option == 2){
            System.out.print("Please enter the weight you want to convert (Kgs): ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The weight in pounds is: %.2f%n", newWeight);
        }
        else {
            System.out.println("Invalid option selected. Please run the program again and select either 1 or 2.");
        }

        scanner.close();
    }
}
