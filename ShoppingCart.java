package ShoppingCart;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // Shopping Chart Program
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price of " + item + "?: ");
        price = scanner.nextDouble();

        System.out.print("How many " + item + " would you like to buy?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("Total cost: " + currency + total);

        System.out.println("Thank you for shopping with us! you bought " + quantity + " " + item + "(s) for a total of " + currency + total);

        scanner.close();
    }
}
