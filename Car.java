package OOP;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isOn = false;

    void start(){
        isOn = true;
        System.out.println("You START the engine");
    }
    void stop(){
        isOn = false;
        System.out.println("You STOP the engine");
    }
    void drive(){
        System.out.println("you drive the " + model);
    }
    void brake(){
        System.out.println("you brake the " + model);
    }
}
