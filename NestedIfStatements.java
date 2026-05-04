package NestedIfStatements;

public class NestedIfStatements {
    public static void main(String[] args) {
        boolean isStudent = truef;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("Senior discount applied of 20%.");
                System.out.println("Student discount applied of 10%.");
                price *= 0.7; // Apply 20% discount       
            }
            else{
                System.out.println("Student discount applied of 10%.");
                price *= 0.9; // Apply 10% discount
            }
        }else{
            if (isSenior) {
                System.out.println("Senior discount applied of 20%.");
                price *= 0.8;
            }
            else{
            System.out.println("No discounts applied.");
        }
        }

        System.out.printf("Final price: $%.2f\n", price);
    }
}
