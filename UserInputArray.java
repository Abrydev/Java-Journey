package UserInputArray;
import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        // String[] foods = {"Pizza", "Taco", "Hamburger"};

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("what # of food do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
         

        // foods[0] = "pizza";
        // foods[1] = "taco";
        // foods[2] = "hamburger";

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter the food you want: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();

    }
}
