//don't know what this is yet
package variable;
public class Variable {
    public static void main(String[] args) {
        /* Variable = a reuseable container for a value
                      a variable behaves as if it was the value it contains */

        // primitive = simple value stored directly in memory (stacked)
        // reference = memory address (stacked) that points to the (heap)

        /* primitive vs reference */
        // int          string
        // double       array
        // char         object
        // boolean

        /* 2 steps to creating a variable */
        // 1. declaration
        // 2. assignment

        int age = 21;
        int year = 2026;
        int quantity = 5;

        System.out.println("My age is " + age + " years old");
        System.out.println("new " + year + " new me");
        System.out.println("I'll have " + quantity + " of those");

        double price = 15.500;
        double gpa = 3.5;
        double temperature = 12.5;

        System.out.println("that'll be Rp." + price);
        System.out.println("my gpa is " + gpa);
        System.out.println("it's " + temperature + " celcius outside");

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("my grade is an " + grade + " plus");
        System.out.println("I'm mad" + symbol);
        System.out.println("it's " + currency + "50 dollars");

        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;

        if (isStudent) {
            System.out.println("You are a student");
        }else{
            System.out.println("You are not a student");
        }

        String name = "Aubrey";

        System.out.println("my name is " + name);

        String food = "Pizza";

        System.out.println("my favorite food is " + food);

        String email = "rmuhammadaubrey@gmail.com";

        System.out.println("my Email is " + email);

        String car = "Mazda";

        System.out.println("Oh my car is a " + car);

        String color = "Yellow";

        System.out.println("my favorite color is " + color + " btw");
    }
}